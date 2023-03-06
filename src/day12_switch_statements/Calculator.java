package day12_switch_statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        double numbOne = input.nextDouble();

        System.out.println("Enter 2nd number: ");
        double numbTwo = input.nextDouble();

        System.out.println("Select operator: \n\t +\n\t-\n\t*\n\t?\n\t%\n\t Enter");
        String operator = input.next();

        boolean isValidOperator = false;


        double result = 0;

        switch (operator) {
            case "+":
                result = numbOne + numbTwo;
                break;
            case "-":
                //if numOne > numtwo ------> numone - numTwo
                //else numtwo - numOne
                if (numbOne > numbTwo) {
                    result = numbOne - numbTwo;
                } else {
                    result = numbTwo - numbOne;
                }
                break;
            case "*":
                result = numbOne * numbTwo;
                break;
            case "/":
                // 4/0 is not acceptable on math .
                // 0/4 this is ok.
                if (numbTwo != 0) {                  //operator.equals("/") yapabiliriz case "/" ile case "%" merge ettigimizde.
                    result = numbOne / numbTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            case "%":
                // 4/0 is not acceptable on math .
                // 0/4 this is ok.
                if (numbTwo != 0) {
                    result = numbOne % numbTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            default:
                System.out.println(operator + " is not a valid for this calculator");
                isValidOperator = false;

        }

        if (isValidOperator) {

            System.out.println(numbOne + " " + operator + " " + numbTwo + "=" + result);
        }


    }
}
