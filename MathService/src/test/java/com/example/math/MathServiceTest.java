package com.example.math;

import com.example.models.Expression;
import com.example.models.Operation;
import com.example.models.ParseException;
import com.example.services.math.MathService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MathServiceTest {

    private MathService mathService;
    private int first, second;
    private Operation oper;
    private int expected;

    public MathServiceTest(int first, int second,Operation oper, int expected) {
        this.first = first;
        this.second = second;
        this.oper = oper;
        this.expected = expected;

    }

    @Before
    public void setup() {
        mathService = new MathService();

    }

    @After
    public void tearDown() {
        mathService = null;
    }

    @Test
    public void test() throws ArithmeticException, ParseException {
        Expression expression = new Expression();

        expression.setFirst(first);
        expression.setSecond(second);
        expression.setOperation(oper);

        Assert.assertEquals(expected, mathService.calculate(expression));
    }



    @Parameterized.Parameters(name = "Inputs: a ={0}; b = {1}; operation = {2}; expected = {3}")
    public static Collection<Object[]> dataProvider()
    {
        return Arrays.asList(new Object[][]{
                {-5, 12, Operation.ADD, 7},
                {5, 3, Operation.SUB, 2},
                {-15, 3, Operation.MUL, -45},
                {81, 9, Operation.DIV, 9 }
        });
    }
}
