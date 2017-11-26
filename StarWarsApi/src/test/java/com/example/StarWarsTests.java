package com.example;

import com.example.models.*;
import com.example.config.ConfigProvider;
import com.google.gson.Gson;
import org.junit.Assert;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class StarWarsTests {

    private static final Gson GSON = new Gson();

    @Test
    public void LukeFromTatooineTest() {

        People response = given()
                .baseUri(ConfigProvider.INSTANCE.getServerUrl())
                .expect()
                .when()
                .get("/people/1/").as(People.class);

        Planet responseP = given()
                .baseUri(ConfigProvider.INSTANCE.getServerUrl())
                .expect()
                .when()
                .get(response.getHomeworld().replace(ConfigProvider.INSTANCE.getServerUrl(),"")).as(Planet.class);

        Assert.assertEquals("Tatooine", responseP.getName());


    }


    @Test
    public void TatooineWasInFiveFilmsTest() {
        Planet response = given()
                .baseUri(ConfigProvider.INSTANCE.getServerUrl())
                .expect()
                .when()
                .get("/planets/1/").as(Planet.class);

       Assert.assertEquals(5, response.getFilms().size());
    }

    @Test
    public void StarshipsCountTest() {
        SWCollection<Starship> response;

        response = given()
                .baseUri(ConfigProvider.INSTANCE.getServerUrl())
                .expect()
                .when()
                .get("/starships/").as(SWCollection.class);


        Assert.assertEquals(37, response.getCount());
    }

    @Test
    public void LukeInWookieeTest() {

        given()
                .baseUri(ConfigProvider.INSTANCE.getServerUrl())
                .expect()
                .when()
                .get("/people/1/?format=wookiee")
                .then()
                .body("whrascwo", equalTo("Lhuorwo Sorroohraanorworc"));

    }
}
