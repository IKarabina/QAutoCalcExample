package com.example.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class URLCalculatorTest {

    private CalculatorApiClient apiClient;

    @Before
    public void setup(){
        apiClient = new URLApiClient();
    }

    @Test
    public void shouldWork(){
        final String expected = "15";
        final String actual = apiClient.evaluateExpression("7+8");
        Assert.assertEquals(expected, actual);
    }
}
