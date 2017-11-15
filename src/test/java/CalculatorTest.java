import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private String expression;
    private int expected;
    private Calculator calc;


    public CalculatorTest(String expression, int expected) {
        this.expression = expression;
        this.expected = expected;

    }

    @Before  // BeforeClass + static
    public void setup() {
        calc = new Calculator();

    }

    @After  // AfterClass + static
    public void tearDown() {
        calc = null;
    }

    @Test
    public void test() throws ArithmeticException, ParseException {
        Assert.assertEquals(expected, calc.evaluate(expression));
    }


    @Parameterized.Parameters(name = "Inputs: expression ={0}; expected = {1}")
    public static Collection<Object[]> dataProvider()
    {
        return Arrays.asList(new Object[][]{
                {"-152 + -285", -437},
                {"-522 - 152", -674},
                {" 2452 * -10 ", -24520},
                {"454 / -85", -5 }
        });
    }
}
