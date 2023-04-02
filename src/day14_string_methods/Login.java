package day14_string_methods;

import java.util.Scanner;

public class Login {
    /*

        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than equal to 8 characters long

        valid system username: "loopcamp"

        -> if the entered password matches the system password
            logged in

            otherwise print:

            invalid password
*/


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your username: ");

            String userName = input.next();          //loopcamp
            userName = userName.toLowerCase();              //we reassigned    made sure userName is lowercase which case told us


            System.out.println("Please, enter a password: ");
            String password = input.next();               //james



            //method --->    .length();    how many characters are in ,  this methods take that word in
            int passwordLength = password.length();
            System.out.println(passwordLength);


            if (passwordLength >=8 && userName.equals("loopcamp")){              //  check if the password is more than 8 characters long
                System.out.println("You are logged in as " + userName);
            } else {
                if (passwordLength<8) {
                    System.out.println("Password length does not match");
                }

                if(!userName.equals("loopcamp")){            //we flipped with ! its "not true"
                    System.out.println("Invalid username");
                }
            }
























        }





    }

