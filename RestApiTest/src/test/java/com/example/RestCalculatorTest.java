package com.example;

import com.example.api_client.CalculatorApiClient;
import com.example.api_client.RestAssuredApiClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RestCalculatorTest {

    private CalculatorApiClient apiClient;

    @Before
    public void setup(){
        apiClient = new RestAssuredApiClient();
    }

    @Test
    public void shouldWork(){
        final String expected = "1";
        final String actual = apiClient.evaluateExpression("8-7");
        Assert.assertEquals(expected, actual);
    }
}
