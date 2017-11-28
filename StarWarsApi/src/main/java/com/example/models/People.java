package com.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class People extends SWEntity{

    private String name;
    @SerializedName("birth_year")
    private String birthYear;
    @SerializedName("eye_color")
    private String eyeColor;
    private String gender;
    @SerializedName("hair_color")
    private String hairColor;
    private String height;
    private String weight;
    @SerializedName("skin_color")
    private String skinColor;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;


}
