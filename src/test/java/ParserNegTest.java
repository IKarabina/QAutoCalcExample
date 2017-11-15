import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParserNegTest {
    private String expression;
    private Parser parser;



    public ParserNegTest(String expression /*, ParseException expected*/) {
        this.expression = expression;

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
        parser.evaluate(expression);

     }


    @Parameterized.Parameters(name = "Inputs: expression ={0}")
    public static Collection<Object[]> dataProvider()
    {
        return Arrays.asList(new Object[][]{
                {"-g + -285"},
                {"-522 - 1.2"},
                {" 24t2 * -10 "},
                {"454 ^ -85!"}

        });
    }
}
