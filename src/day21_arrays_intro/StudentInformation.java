package day21_arrays_intro;
/*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number
     */

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String [] student1 = {"B001", "Tom", "Jerry", "B#1"};
        System.out.println("This os the info for Student 1: " + Arrays.toString(student1));

    String [] student2 = new String[4];
        System.out.println("This is the info for Student 2" + Arrays.toString(student2));  //   I have reserved info for student 2 but dont have value yet

        student2[0] = "B002";
        student2[1] = "John";
        student2[2] = "Wick";
        student2[3] = "B#2";
        System.out.println("This is the info for Student 2" + Arrays.toString(student2));  //   we gave value yukarda now it has valaues


        String [] student3 = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID:");
        student3 [0] = input.next();

        System.out.println("Enter Name:");
        student3 [1] = input.next();


        System.out.println("Enter LastName:");
        student3 [2] = input.next();

        System.out.println("Enter Batch No:");
        student3 [3] = input.next();
        System.out.println("This is the info for Student 3" + Arrays.toString(student3));

        System.out.println("-------------------------");


        String [] questions = {"Enter ID:", "Enter LastName:", "Enter Batch No"};         //I need to ask all questions above to every students. so I made them together
        String [] student4 = new String[4];

        for (int i = 0; i < questions.length; i++) {                               //  I could use questons.length instead 4
            System.out.println(questions[i]);  //reading each element og the questiuons arrays
            student4[i] = input.next();       //assigning the scanner input basically users put into student4 array
        }


        System.out.println("This is the info for Student 4" + Arrays.toString(student4));







    }
}
