package day09_a__scanner;

import java.util.Scanner;


/*Write a program that asks the user to "enter a price and quality "
and then calculate revenue. revenue = price * quantity.
 */

public class Revenue {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);   //Java creates an objects here

        double price;    //Java declares a price that has data type of double   // 10.99;(oncesinde koydum)
        int quantity;    ////Java declares a price that has data type of int                       //5;

        System.out.println("Enter the price and quantity:");  //Java says print out whatever is in double quote
        price = input.nextDouble();   // Java asks user to put input/info/value then assign that value to price variable
        quantity = input.nextInt();  //Java asks user to put input/info/value then assign that value to quantity variable

        double revenue = price * quantity;
        System.out.println("Your revenue : "  +revenue);


        System.out.println();
        System.out.println(price);
        System.out.println(quantity);   //hard coded still here. I have to come back to double price = 10.99; and change.. so now I want it to be dynamic.



       // System.out.println("Enter the price");
        //System.out.println("Enter the quantity :");






    }
}
