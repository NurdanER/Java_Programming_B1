package day07_relational_operators;

public class SignType {

    /*
         Declare and assign a number

        I want to know the sing of the number
            if the number is positive
            if the number is negative
            if the number is 0
     */
    public static void main(String[] args) {
        int number= 0;
        number--; //4

        boolean isPositive = number>= 0;
        boolean isNegative = number<= 0;
        boolean isZero = number == 0;

        System.out.println(number + " is bigger than zero: " + isPositive);
        System.out.println(number + " is bigger than zero: " + isNegative);
        System.out.println(number + " is bigger than zero: " + isZero);

        System.out.println();


        int number1 =-1;
        number1--;
        System.out.println(number1 + " is bigger than zero: " + isPositive);
        System.out.println(number1+ " is bigger than zero: " + isNegative);
        System.out.println(number1+ " is bigger than zero: " + isZero);






    }
}
