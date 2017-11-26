package com.example.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCostInCredits() {
        return costInCredits;
    }

    public void setCostInCredits(int costInCredits) {
        this.costInCredits = costInCredits;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    public void setMaxAtmospheringSpeed(int maxAtmospheringSpeed) {
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getConsumables() {
        return consumables;
    }

    public void setConsumables(int consumables) {
        this.consumables = consumables;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public List<String> getPilots() {
        return pilots;
    }

    public void setPilots(List<String> pilots) {
        this.pilots = pilots;
    }
}
