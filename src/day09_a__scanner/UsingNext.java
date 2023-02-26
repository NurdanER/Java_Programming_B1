package day09_a__scanner;


import java.util.Scanner;

public class UsingNext {

    public static void main(String[] args) {

        //Create Scanner object

        Scanner input = new Scanner(System.in);

        System.out.println("Today is Saturday");
        System.out.print("What is todays class?"); //Java
        String className = input.next();
        System.out.println();


        System.out.print("What month is it? "); //February
        String month = input.next();

        System.out.println("I like " + month+ " month");
        System.out.println();


        input.nextLine();  //if it is nextline is first we dont have to use this but if we have scanner before nextline we use this tp handle it

        System.out.print("Enter your full name: ");   //multiple worss = has space in it
        String fullName = input.nextLine();
      //  System.out.println("Full name is: " +fullName);

        //In Scanner there is a method called   .close();
        input.close();






    }
}
