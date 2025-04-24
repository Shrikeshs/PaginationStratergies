package com.example.pagination.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@JsonDeserialize(builder = Race.class)
public class Race {

     String season;
     int round;
     String raceName;
     ApiCircuit Circuit;
     String date;
     String time;
}

