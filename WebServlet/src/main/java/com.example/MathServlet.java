package com.example;

import com.example.models.ParseException;
import com.example.services.Calculator;
import com.example.services.math.MathService;
import com.example.services.parser.Parser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MathServlet extends HttpServlet {

    private Calculator calculator = new Calculator(
            new Parser(),
            new MathService()
    );


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String expression = req.getQueryString();

        try {
            resp.setContentType("text/plain");
            resp.getOutputStream().print(calculator.evaluate(expression));
        } catch (ParseException e) {
            resp.sendError(400, e.getMessage());
        }

    }
}