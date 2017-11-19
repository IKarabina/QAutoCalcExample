package com.example.services.math.operations;

import com.example.models.Operation;

public class MathOperation {

    public int calculate (int a, int b, Operation operation) throws ArithmeticException
    {

        switch (operation) {
            case ADD : return a + b;
            case SUB : return a - b;
            case MUL : return a * b;
            case DIV : return a / b;
            default: return 0;

        }

    }


}
