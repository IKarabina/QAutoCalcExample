import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorNegTest {
    private String expression;
    private int expected;
    private Calculator calc;


    public CalculatorNegTest(String expression ) {
        this.expression = expression;

    }

    @Before
    public void setup() {
        calc = new Calculator();

    }

    @After
    public void tearDown() {
        calc = null;
    }

    @Test(expected = ArithmeticException.class)
    public void test() throws ArithmeticException, ParseException {
        Assert.assertEquals(expected, calc.evaluate(expression));
    }


    @Parameterized.Parameters(name = "Inputs: expression ={0}")
    public static Collection<Object[]> dataProvider()
    {
        return Arrays.asList(new Object[][]{
                {"454 / 0" }
        });
    }
}
