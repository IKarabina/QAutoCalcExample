package com.example.api_client;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class RestAssuredApiClient implements CalculatorApiClient {

    @Override
    public String evaluateExpression(String expression){
        Response response = RestAssured.given()
                .log().all()
                .baseUri("http://localhost:8080")
                .and()
              //  .basePath("/Calculator?" + expression.replaceAll(" ", ""))
                .expect()
                .statusCode(200)
                .when()
                .get("/Calculator?"+ expression.replaceAll(" ", ""));


        return response.getBody().asString();
    }

}
