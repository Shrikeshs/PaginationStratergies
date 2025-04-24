package com.example.pagination.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;


@Value
@Builder(toBuilder = true)
@JsonDeserialize(builder = ApiCircuit.class)
 class ApiCircuit {
    String circuitName;
    ApiLocation Location;
}
