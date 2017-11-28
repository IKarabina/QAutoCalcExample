package com.example.models;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class Film extends SWEntity{

    private String title;
    @SerializedName("episode_id")
    private int episodeID;
    @SerializedName("opening_crawl")
    private String openingCrawl;
    private String director;
    private String producer;
    @SerializedName("release_date")
    private Date releaseDate;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> characters;
    private List<String> planets;


}
