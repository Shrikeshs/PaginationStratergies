package com.example.pagination.controllers;

import com.example.pagination.client.RacesApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/formula1")
public class RacesController {

    @Autowired
    private final RacesApiService apiClientCaller;

    public RacesController(RacesApiService apiClientCaller) {
        this.apiClientCaller = apiClientCaller;
    }


    @GetMapping("/")
    public String getSeasons() {
        return apiClientCaller.makeApi();
    }
}
