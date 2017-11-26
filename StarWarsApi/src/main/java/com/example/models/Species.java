package com.example.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAveragHeight() {
        return averagHeight;
    }

    public void setAveragHeight(int averagHeight) {
        this.averagHeight = averagHeight;
    }

    public int getAveragLifespan() {
        return averagLifespan;
    }

    public void setAveragLifespan(int averagLifespan) {
        this.averagLifespan = averagLifespan;
    }

    public String getEyeColors() {
        return eyeColors;
    }

    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
    }

    public String getSkinColors() {
        return skinColors;
    }

    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }
}
