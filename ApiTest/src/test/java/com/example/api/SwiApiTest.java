package com.example.api;

import com.example.models.People;
import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;

public class SwiApiTest {

    private static final Gson GSON = new Gson();

    @Test
    public void getPersonTest() {
        People response = RestAssured.given()
                .baseUri("https://swapi.co/api/")
                .expect()
                .when()
                .get("/people/1/").as(People.class);

        //response.getBody().prettyPrint();

        Assert.assertEquals("Luke Skywalker", response.getName());
    }
}
