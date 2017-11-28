package com.example.models;


import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Planet extends SWEntity{

    private String name;
    private String climate;
    private int diameter;
    private String gravity;
    @SerializedName("orbital_period")
    private int orbitalPeriod;
    private int population;
    @SerializedName("rotation_period")
    private int rotationPeriod;
    @SerializedName("surface_water")
    private int surfaceWater;
    private String terrain;

    private List<String> films;
    private List<String> residents;


}
