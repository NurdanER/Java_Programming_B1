package day09_b__if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

     /*
    boolean variable isHungry

            if the person is hungry,print: You are hungry, so I will get some food for you

            if the person is not hungry, print: Great, then practice java
     */

     // Create a Scanner Object
     Scanner input = new Scanner(System.in);
        System.out.print("Ruslan are you hungry (true or false): ");
        boolean isHungry = input.nextBoolean();


        if (isHungry) {
            System.out.println("Lets go to Texas DeBrazil");

        } else{
            System.out.print("I can not stay without eating anything. Give me DOLMA at least");
        }

    }
}
