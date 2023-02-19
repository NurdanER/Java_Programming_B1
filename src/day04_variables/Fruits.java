package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        /* int apples = 50, grapes = 100, bananas =150
        we can write like this if data tpes are the same.
         */

        System.out.println("Apples :"+ apples);
        System.out.println("Grapes :"+ grapes);


        apples= 30;
        System.out.println("Apples left "+ apples);



        double price= 20.0;
        System.out.println("This price for 100 grapes is $20.0"); // hard coded
        System.out.println("This price for "+ grapes + " grapes is $20.0");
        // if I change grape value then it gonna change automaticlly in the second one.

    }
}
