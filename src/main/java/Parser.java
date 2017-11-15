import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser extends ParseException {

    private Operation operation;
    private char oper;
    private int first, second;

    public void evaluate(String expression) throws ParseException {

          String clearExpression = expression.replaceAll(" ", "");

        try {
              oper = getOperation(clearExpression);
              first = Integer.parseInt(clearExpression.substring(0, getOperationIndex(clearExpression)));
              second = Integer.parseInt(clearExpression.substring(getOperationIndex(clearExpression) + 1));

              switch (oper) {
                  case '+':
                     operation=Operation.ADD;
                     break;
                  case '-':
                      operation=Operation.SUB;
                      break;
                  case '*':
                      operation=Operation.MUL;
                      break;
                  case '/':
                      operation=Operation.DIV;
                      break;
                  default: operation=null;
              }

          }catch (Exception e){
                throw new ParseException("Wrong parse");
          }
      }

      private char getOperation (String exp) {

          String s = exp.replaceAll("\\d", "");
          if (s.charAt(0) == '-' && s.length()>1)
            return s.charAt(1);
          else
              return s.charAt(0);


      }

      private int getOperationIndex (String exp){

          int index = -1;
          String regex = "[+*/-]";
          Pattern pattern = Pattern.compile(regex);

          if (exp.charAt(0) == '-') {
              String checkStr = exp.substring(1, exp.length());
              Matcher matcher = pattern.matcher(checkStr);
             if (matcher.find()) {
                   index = matcher.start()+1;
              }

          }
          else
          {
              Matcher matcher = pattern.matcher(exp);
              if (matcher.find()) {
                  index = matcher.start();
              }
          }

          return index;
      }

      public int getFirstOperand (){
          return this.first;
      }

      public int getSecondOperand (){
        return this.second;
      }

      public Operation getOperation (){
        return this.operation;
      }
}