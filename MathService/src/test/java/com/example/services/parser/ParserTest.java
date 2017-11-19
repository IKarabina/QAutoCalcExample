package com.example.services.parser;

import com.example.models.Expression;
import com.example.models.Operation;
import com.example.models.ParseException;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParserTest {
    private String expr;
    private int first, second;
    private Operation operation;
    private Parser parser;
    private Expression expression;


    public ParserTest(String expr, int first, int second, Operation operation) {
        this.expr = expr;
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    @Before
    public void setup() {
         parser = new Parser();

    }

    @After
    public void tearDown() {
        parser = null;
    }

    @Test
    public void test() throws ParseException {
        expression = parser.parse(expr);
        Assert.assertEquals(first, expression.getFirst());
        Assert.assertEquals(second, expression.getSecond());
        Assert.assertEquals(operation, expression.getOperation());
    }


    @Parameterized.Parameters(name = "Inputs: expression ={0}; first = {1}; second ={2}; oper = {3}")
    public static Collection<Object[]> dataProvider()
    {
        return Arrays.asList(new Object[][]{
                {"-152 + -285",-152,-285, Operation.ADD},
                {"-522 - 152",-522, 152,  Operation.SUB},
                {" 2452 * -10 ",2452, -10,  Operation.MUL},
                {"454 / -85", 454, -85, Operation.DIV}
        });
    }
}
