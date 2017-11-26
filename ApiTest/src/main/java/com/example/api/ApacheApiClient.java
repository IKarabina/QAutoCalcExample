package com.example.api;

import com.example.config.ConfigProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

public class ApacheApiClient implements CalculatorApiClient {
    @Override
    public String evaluateExpression(String expression) {

        final StringBuilder result = new StringBuilder();

        try {
            final HttpUriRequest request =
                new HttpGet(URI.create(ConfigProvider.INSTANCE.getServerUrl() + "/Calculator?" + expression.replaceAll(" ", "")));


            CloseableHttpResponse response =
                     HttpClientBuilder.create().build().execute(request);

            final int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode == 200) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    String line;
                    while ((line = in.readLine()) != null) {
                        result.append(line);
                    }

            } else {
                throw new RuntimeException("Server returned " + statusCode + " code");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }
}
