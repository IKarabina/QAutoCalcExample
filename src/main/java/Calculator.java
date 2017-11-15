public class Calculator extends ArithmeticException{

    public int evaluate(String expression) throws ArithmeticException, ParseException{
        MathOperation calc = new MathOperation();
        Parser parser = new Parser();
        parser.evaluate(expression);
        return calc.calculate(parser.getFirstOperand(), parser.getSecondOperand(), parser.getOperation());

    }
}
