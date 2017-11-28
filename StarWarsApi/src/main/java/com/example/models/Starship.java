package com.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Starship extends  SWEntity {

    private String name;
    private String model;
    @SerializedName("starship_class")
    private String starshipClass;
    private String manufacturer;
    @SerializedName("cost_in_credits")
    private int costInCredits;
    private int length;
    private int crew;
    private int passengers;
    @SerializedName("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    @SerializedName("hyperdrive_rating")
    private double hyperdriveRating;
    @SerializedName("MGLT")
    private String mglt;
    @SerializedName("cargo_capacity")
    private int cargoCapacity;
    private String consumables;

    private List<String> films;
    private List<String> pilots;

}
