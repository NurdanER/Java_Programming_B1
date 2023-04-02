package day22_arrays;
/*
using same letters but have different combination
silent // listen
 */

import java.util.Arrays;

public class AnagramInterviewQuestion {
    public static void main(String[] args) {

        String word1 = "silent";
        String word2 = "listen";

        //1- First convert to array
        //String [] wordArr1 = word1.split("");

        char [] wordArr1 = word1.toCharArray();
        char[] wordArr2 = word2.toCharArray();


        //2- sort both arrays
        Arrays.sort(wordArr1);
        Arrays.sort(wordArr2);

        //3- compare two arrays with ternary
        System.out.println(Arrays.equals(wordArr1, wordArr2) ? "Anagram" : "Not Anagram");

        // this is extra just showing it with if else statement
        if (Arrays.equals(wordArr1, wordArr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }






    }
}
