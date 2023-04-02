package day17_loops;

import java.util.Scanner;

public class AtmLogin {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM");
        int validPin = 1788;                //once user writes the correct answer we need to stop loop
                                            // number cannot start with 0 when we use int data types.
        int attemptCount = 0;
        int userInputPin;


        Scanner input = new Scanner(System.in);

        /*
        ask user to "Enter a pin"
        after three invalid pin attempt, end asking user

         */


        do {
            System.out.println("Enter a pin ");  // I want to do this action 3 times.
            userInputPin = input.nextInt();
            attemptCount++;
        } while (attemptCount<=3 && validPin != userInputPin);         //only 3 times we run and when the user writes correct pin, loop stops
        //while 3 ivalid item and user validpin is not equ;l to inputpin loop 3 times continues yukarda.

        if (validPin == userInputPin) {   //when user input pin and is the equal valid pin then loops stop
            System.out.println("You are logged in");
        } else {
            System.out.println("You are logged out. Please contact costumer servicer"); //after 3 invalid pin input this is going to be printed
        }

















    }
}
