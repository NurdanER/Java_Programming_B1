package day08_scanner_logical_operators;


/*create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean

 */

import java.util.Scanner;

public class WorkStatus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     //this is our object

        System.out.print("Enter your first name: ");  //print den sonra ln koymadim cunku next line a gecmek istemiyorm
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();


        System.out.print("How are you? ");
        String feeling = input.next();

        System.out.print("What is the best team? ");
        String team = input.next();


        System.out.println();





        System.out.println("\nFirst name:\t" +firstName + "\nLast name:\t" + lastName);
        System.out.println("How are you: \t" +feeling);
        System.out.println("Best team ever:\t");



    }
}
