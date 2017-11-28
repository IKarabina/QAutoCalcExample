package com.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Vehicle extends SWEntity {

    private String name;
    private String model;
    @SerializedName("vehicle_class")
    private String vehicleClass;
    private String manufacturer;
    private int length;
    @SerializedName("cost_in_credits")
    private int costInCredits;
    private int crew;
    private int passengers;
    @SerializedName("max_atmosphering_speed")
    private int maxAtmospheringSpeed;
    @SerializedName("cargo_capacity")
    private int cargoCapacity;
    private int consumables;

    private List<String> films;
    private List<String> pilots;


}
