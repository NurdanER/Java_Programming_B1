package day15_string;
/*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

Ex:
    "java"
    "mouse"
    "computer"

Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter 3 words:");
        //String word1,word2,word3 = input.next();    we can declare them like this as well.
        String word1 = input.next();
        String word2 = input.next();
        String word3 = input.next();

        int word1Length = word1.length();
        int word2Length = word2.length();
        int word3Length = word3.length();

        //How do I find the longest one among these three?


if  (word1.contains("a") && (word1Length>= word2Length && word1Length>= word3Length)) {
    System.out.println(word1 + " is the biggest with \"a\"");
}else if (word2.contains("a")&& (word2Length>=word1Length && word2Length>=word3Length)) {
    System.out.println(word1 + " is the biggest with \"a\"");
} else if (word3.contains("a") && (word3Length>=word1Length && word3Length >= word2Length)){
    System.out.println(word1 + " is the biggest with \"a\"");
} else {
    System.out.println("No single largest word with \"a\"");
}






    }
}
