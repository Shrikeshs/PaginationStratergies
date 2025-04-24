package com.example.pagination.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;

@Value
@Builder(toBuilder = true)
@JsonDeserialize(builder = RaceTable.class)
public class RaceTable {
    String season;
    ArrayList<Race> raceList;
}
