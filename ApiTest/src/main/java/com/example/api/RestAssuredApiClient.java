package com.example.api;

import com.example.config.ConfigProvider;
import com.jayway.restassured.RestAssured;

public class RestAssuredApiClient implements CalculatorApiClient {

    @Override
    public String evaluateExpression(String expression){
        return RestAssured.given()
                .log().ifValidationFails()
                .urlEncodingEnabled(false)
                .baseUri(ConfigProvider.INSTANCE.getServerUrl())
                .expect()
                .statusCode(200)
                .when()
                .get("/Calculator?" + expression.replaceAll(" ", ""))
                .asString();


    }

}
