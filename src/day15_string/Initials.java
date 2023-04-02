package day15_string;
/*
         Ask the user to enter their first name
         Ask the user to enter their last name
         Print the initials as uppercase letters

         james
         bond
         JB
      */

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     //initial character: isminin bas harfi ve son harfi

        System.out.print("Enter first name: ");
        String first = input.next();
        System.out.print("Enter last name: ");
        String last = input.next();

        //har firstChar = first.charAt(0);

        String initials = "" + first.charAt(0) + last.charAt(0);     //we need to put "" to be executed. "" makes it String.   //index of first characters are always zero "0"

        //String initials = ("" + first.charAt(0) + last.charAt(0)).toUpperCase();
        //initials = initials.toUpperCase();
        System.out.println("Your initial is: " + initials);
        System.out.println("Your initial is: " + initials.toUpperCase());

    }
}
