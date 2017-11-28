package com.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Species extends SWEntity {

    private String name;
    private String classification;
    private String destination;
    @SerializedName("average_height")
    private int averagHeight;
    @SerializedName("average_lifespan")
    private int averagLifespan;
    @SerializedName("eye_colors")
    private String eyeColors;
    @SerializedName("skin_colors")
    private String skinColors;
    private String language;
    private String homeworld;

    private List<String> people;
    private List<String> films;

}
