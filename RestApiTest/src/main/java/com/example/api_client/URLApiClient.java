package com.example.api_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLApiClient implements CalculatorApiClient {

    @Override
    public String evaluateExpression(String expression) {

        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL("http://localhost:8080/Calculator?"+expression.replaceAll(" ", ""));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
           // connection.setDoOutput(true); for "POST"

            connection.connect();
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = input.readLine())!=null){
                System.out.println(line);
                result.append(line);
            }

        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
