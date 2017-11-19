package com.example.services.parser;

import com.example.models.Expression;
import com.example.models.Operation;
import com.example.models.ParseException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser  {


    public Expression parse(String expression) throws ParseException {

        Expression expr = new Expression();
        try {

             String clearExpression = expression.replaceAll(" ", "");
             char oper = getOperation(clearExpression);

            int first = Integer.parseInt(clearExpression.substring(0, getOperationIndex(clearExpression)));
            int second = Integer.parseInt(clearExpression.substring(getOperationIndex(clearExpression) + 1));

            expr.setFirst(first);
            expr.setSecond(second);

             switch (oper) {
                  case '+':
                     expr.setOperation(Operation.ADD);
                     break;
                  case '-':
                      expr.setOperation(Operation.SUB);
                      break;
                  case '*':
                      expr.setOperation(Operation.MUL);
                      break;
                  case '/':
                      expr.setOperation(Operation.DIV);
                      break;
                  default:
                      throw new ParseException("Wrong operation :" + oper );
              }



          }catch (Exception e){
                throw new ParseException("Wrong expression parse");
          }

          return expr;
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

}