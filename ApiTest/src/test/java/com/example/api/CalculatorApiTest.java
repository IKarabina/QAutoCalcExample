package com.example.api;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorApiTest {
    private CalculatorApiClient apiClient;

    @Test
    public void withJavaNetClient() {
        apiClient = new URLApiClient();
        executeTest();
    }

    @Test
    public void withApacheClient() {
        apiClient = new ApacheApiClient();
        executeTest();
    }

    @Test
    public void withRestAssuredClient() {
        apiClient = new RestAssuredApiClient();
        executeTest();
    }

    private void executeTest() {
        final String expected = "42";
        final String actual = apiClient.evaluateExpression("6*7");
        Assert.assertEquals(expected, actual);
    }
}
