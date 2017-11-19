package com.example;

import com.example.services.Calculator;
import com.example.services.parser.Parser;
import com.example.services.math.MathService;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator(new Parser(), new MathService());

        int result = calculator.evaluate("1 + 2");

        System.out.println(result);
    }
}
