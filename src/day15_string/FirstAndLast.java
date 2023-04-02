package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.println("First char: " + sentence.charAt(0));       //0 is the first index and with charAt this gives us the first char always
        System.out.println("Last char: " + sentence.charAt(sentence.length()-1));    // this one gives always the last index and with charAt I take as a char
        //If I want 3 char I can say sentence.charAt(sentence.length()-3)); !!


        // int length = sentence.length();         we can write also like this;p
        //System.out.println("Last char: "+ sentence.charAt(--length));















    }
}
