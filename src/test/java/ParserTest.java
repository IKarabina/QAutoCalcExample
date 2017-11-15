import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParserTest {
    private String expression;
    private int first, second;
    private Operation operation;
    private Parser parser;


    public ParserTest(String expression, int first, int second, Operation operation) {
        this.expression = expression;
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
        parser.evaluate(expression);
        Assert.assertEquals(first, parser.getFirstOperand());
        Assert.assertEquals(second, parser.getSecondOperand());
        Assert.assertEquals(operation, parser.getOperation());
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
