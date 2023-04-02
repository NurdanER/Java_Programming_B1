package day15_string;
/*
   [Move first word]
       Given a sentence. Display the sentence with the first word moved to the end of the sentence.
       Ex:
       Input: Java is a fun language
       Output: is a fun language Java
       Hint: Use indexOf and substring
    */

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //Javaaa is a fun language           //index 4 is a space. space has index number as well
        //0123456789......
        // 1 - get index of first space
        int firstIndexOfSpace = sentence.indexOf(" ");   // 6   //(" ") is a space.
        // 2 - get the first word / "java"
        String beginning = sentence.substring(0, firstIndexOfSpace );          //
        // 3 - second part of the sentence
        String secondPart = sentence.substring(firstIndexOfSpace+1);        //the first indecofspace is number 4 and +1 makes it start from i after space.
        // String secondPart2 = sentence.substring(firstIndexOfSpace).trim();



        System.out.println(beginning);
        System.out.println(secondPart);

        System.out.println(secondPart + " " + beginning);



    }
}
