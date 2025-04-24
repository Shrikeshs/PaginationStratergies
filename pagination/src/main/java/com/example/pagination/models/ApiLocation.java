package com.example.pagination.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@JsonDeserialize(builder = ApiLocation.class)
public class ApiLocation {
     String locality;
     String country;

}
