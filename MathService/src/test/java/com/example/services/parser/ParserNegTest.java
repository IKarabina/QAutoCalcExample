package com.example.services.parser;

import com.example.models.Expression;
import com.example.models.ParseException;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParserNegTest {
    private String expr;
    private Parser parser;
    private Expression expression;



    public ParserNegTest(String expr) {
        this.expr = expr;

    }

    @Before
    public void setup() {
         parser = new Parser();

    }

    @After
    public void tearDown() {
        parser = null;
    }

    @Test (expected = ParseException.class)
    public void test() throws ParseException {
        expression = parser.parse(expr);

     }


    @Parameterized.Parameters(name = "Inputs: expression ={0}")
    public static Collection<Object[]> dataProvider()
    {
        return Arrays.asList(new Object[][]{
                {"-25 ^ 285"},
                {"-522 - 1.2"},
                {" 24t2 * -10 "},
                {"454 ^ -85!"}

        });
    }
}
