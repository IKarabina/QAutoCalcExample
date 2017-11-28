package com.example.services;

import com.example.models.Expression;
import com.example.models.ParseException;
import com.example.services.parser.Parser;
import com.example.services.math.MathService;

public class Calculator {

    private Parser parser = new Parser();
    private MathService mathService = new MathService();

    public Calculator(final Parser parser, final MathService mathService) {
        this.parser = parser;
        this.mathService = mathService;
    }


    public int evaluate(String expression) throws ParseException {

        Expression expr = parser.parse(expression);
        return mathService.calculate(expr);

    }
}
