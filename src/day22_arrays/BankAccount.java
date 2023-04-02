package day22_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String [] bankAccOne = {"Tom Jerry", "Checking", "1000234567", "100,000.00"};

        System.out.println("Number of the elements in the array: " + bankAccOne.length);  //I have 4 elements
        System.out.println("My entire array " + Arrays.toString(bankAccOne)); // [..........]
        System.out.println("Name: " + bankAccOne[0]);        //Tom jerry
        System.out.println("Account type: " +bankAccOne[1]);
        System.out.println("Account no#: " +bankAccOne[2]);
        System.out.println("Balance: $" + bankAccOne[3] );

        System.out.println("------------------------------------");



        String[] bankAccTwo = new String[4];
        System.out.println("Array with default values: " +Arrays.toString(bankAccTwo)); // I have only nulls because I havent give values yet.
        bankAccTwo [0] = "Micky Mouse";    //now I'm giving values
        bankAccTwo [1] = "Savings";
        bankAccTwo [2] = "123456789";
        bankAccTwo [3] = "1,232,432.00";

        // bancAccTwo [4] = "Test"; //RunTimeException -----> ArrayIndexOfBoundException
        // bancAccTwo [4] = 4;       //CompileTimeException

        System.out.println("My entire array 2: " + Arrays.toString(bankAccTwo));

        String [] bankAccThree = new String[4];

        Scanner input = new Scanner (System.in);
        /*
        System.out.print("New: ");
        bankAccThree [0] = input.nextLine();

        System.out.println("Account type: ");
        bankAccThree [1] = input.next();

        System.out.println("Account no#: ");
        bankAccThree [2] = input.next();

        System.out.println("Balance: $ ");
        bankAccThree [3] = input.next();

        System.out.println("My entirre array 3: " + Arrays.toString(bankAccThree));

        */

        System.out.println("-------------------------------------");

        String[] questions = {"Name: ", "Account type: ", "Account no#: ", "Balance: $"};  //we can do all steps yukardaki with loop //4
//                             0                1              2               3


       String [] bankAccFour = new String [4];

        for (int i = 0; i < questions.length; i++) {     //I say lesst than 4 because If I say 4 its out of boun
            System.out.println(questions[i]);
            bankAccFour[i] = input.nextLine();
        }


        System.out.println("My entire array 4: " +Arrays.toString(bankAccFour));








    }
}
