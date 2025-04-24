package com.example.pagination.client;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RacesApiService {


    @Autowired
    private final OkHttpClient okHttpClient;
    private final Logger logger= LoggerFactory.getLogger(RacesApiService.class);

    public RacesApiService(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    //Lets make test APi calls

    public String makeApi(){
        //http://ergast.com/api/f1/seasons
        try {
            Request request = new Request.Builder()
                    .url("http://ergast.com/api/f1/seasons")
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            if(response.isSuccessful() && response.body() != null){
                return response.body().string();
            }
        } catch (Exception e) {
                logger.info("Exception e : ", e);
        }
        return null;
    }
}
