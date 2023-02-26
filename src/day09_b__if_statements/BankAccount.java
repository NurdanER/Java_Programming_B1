package day09_b__if_statements;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

      // Create a Scanner object

        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance");
        double balance = input.nextDouble();

        System.out.print("How much do you want to withdraw?");
        double withdraw = input.nextDouble();

      //(new)
        balance = balance -= withdraw;            // balance = balance - withdraw



        if (balance < 0) {

            System.out.println("You cannot withdraw because balance cannot be less than zero");

        }else{
            System.out.println("Your new balance is " + balance);
        }


        //System.out.println();
        //System.out.println("New balance is: " +balance);




    }
}
