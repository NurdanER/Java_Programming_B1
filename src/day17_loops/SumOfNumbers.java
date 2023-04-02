package day17_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNum = input.nextInt();    //5

        int numOfSum = 0;        //this is the store all the number we have
        //5+6+8+(-1) //loop stops because its negative

        //continue getting a number from user until it is negative number

        while (userNum >=0) {
            numOfSum+= userNum;            //numOfSum + num;  // ikisi de ayni 1.si shorthand operator
            //5+6+8+(-1) //loop stops because its negative
            System.out.println("Sum of the number so far: " + numOfSum);
            System.out.println("Enter number again: ");
            userNum = input.nextInt();

            //This loop will continue as long as  we put negative number.
            // when we give negative number its going top be ended. Because while condition is going to be false and its going to be finished.

            if (userNum < 0) {
                System.out.println(userNum + " is a negative number. That is why the while loop ended.");
            }


        }


































    }
}
