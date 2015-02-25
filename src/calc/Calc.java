package calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
       
        System.out.flush();
        System.out.println("Input expression");
        
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        sc.close();
   
        boolean validateExpression = validateExpression(expression);
        
        if (!validateExpression) {
            System.out.println("wrong format");
            System.exit(0);
        } 
        
        String result = parseExpression(expression);
        
        System.out.println(" = " + result);
    }

    
    public static boolean validateExpression(String expression) {
        //TODO: regular expression for validating expression
        return true;
    }
    
    public static String parseExpression(String expression) {
        
        int i = 0;
        final String firstNumberString = readNumber(expression, i);
        i = firstNumberString.length();
        // +1 for (
        if (expression.charAt(i) == '(') {
            i++;
        }
        final String firstTypeString = readType(expression, i);
        i += firstTypeString.length();
        // +1 for )
        if (expression.charAt(i) == ')') {
            i++;
        }
        char operation = expression.charAt(i);
        i++;
        final String secondNumberString = readNumber(expression, i);
        i += secondNumberString.length();
        // +1 for (
        if (i < expression.length() && expression.charAt(i) == '(') {
            i++;
        }
        final String secondTypeString = readType(expression, i);
        
        final Number firstNumber = OperationService.numberMap(firstNumberString,firstTypeString);
        final Number secondNumber = OperationService.numberMap(secondNumberString,secondTypeString);
        
        int expressionResultArabian = OperationService.Operate(operation, firstNumber, secondNumber);
        
        Number resultInArabian = OperationService.numberMap(Integer.toString(expressionResultArabian),firstTypeString);
        Number result = resultInArabian.convertFromArabian();
        
        return result.stringNumber + result.numberType.getString() ;
    
    }
    
    public static String readNumber(String expression, int position) {
        
        String result = "";
        for (int i = position; i < expression.length(); i++) {
            if(expression.charAt(i) != '(' && expression.charAt(i) != '+')
                result+=expression.charAt(i);
            else 
            break;
        }
        return result;
    } 
    
    public static String readType(String expression, int position) {
        
        String result = "";
        for (int i = position; i < expression.length(); i++) {
            if(expression.charAt(i) != ')' && expression.charAt(i) != '+')
                result+=expression.charAt(i);
            else break;
        }
        return result;
        
    } 
}
