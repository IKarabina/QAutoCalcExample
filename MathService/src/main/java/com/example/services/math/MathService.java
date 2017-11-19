package com.example.services.math;

import com.example.models.Expression;
import com.example.services.math.operations.MathOperation;

public class MathService {

    public int calculate (Expression expression)
    {
        MathOperation mo = new MathOperation();

        return mo.calculate(expression.getFirst(),expression.getSecond(), expression.getOperation());

    }
}
