package day09_a__scanner;
/* /*
    Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0
     */

import java.util.Scanner;

public class Angles {

    public static void main(String[] args) {

        //Create a Scanner object

        Scanner input = new Scanner (System.in);


        //asks the user to enter 3 angle numbers
        System.out.println("Enter 3 angle numbers");

        double degreeOne = input.nextDouble(),     // ilk ikisi virgul cunku devam ediyor.
               degreeTwo = input.nextDouble(),
               degreeThree = input.nextDouble();

        //for triangle ------> total degree of inner calculation is 180 (ucgenin ic acilari toplami 180 )
        //Calculate what is the total of 3 numbers
        double total = degreeOne +degreeTwo + degreeThree;

        //Wrtie a print statement that prints if it is triangle.

        System.out.println("It is triangle : " + (total == 180) );      //triangle is always ads up to 180 //I need paranthesis to do it first then exeute

        //Wrtie a print statement that prints if it is circle

        System.out.println("It is circle : " + (total == 360) );

        //Write a print statement that print if it is either Triangle or Circle
        System.out.println("It is either Triangle or Circle " + (total== 180 || total==360));  //if one of them is true resuly is going to be true.







    }
}
