package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        /* ask user enter a number
        check number if lower than my guessed number -- > it is too low

        check number if higher than my guessed number -- > it is too high

        if it is correct guess---> end the loop and print "You guessed correctly."

         */

        Scanner input = new Scanner(System.in);
        int ourSecretNum = 34;
        int guessNumber;

        do {
            System.out.println("Guess number 1-100 to find what is in my mind");  //this will continue till we get a guessnumber
            guessNumber = input.nextInt();

            if (guessNumber < ourSecretNum) {
                System.out.println("its too low");
            } else if (guessNumber > ourSecretNum) {
                System.out.println("its too high");
            }
        } while (guessNumber!= ourSecretNum); //while your guessnumber is not equal to my secret number, you print do part.
        // I want to do yukardaki action as long as they give guesnumber.
        // loop contnues ntil they gives guessnumber
        // when do I want to end my looop? whenever they gives the guessnumber
        System.out.println("You guessed the correct number which is " + ourSecretNum);














    }
}
