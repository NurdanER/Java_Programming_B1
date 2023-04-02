package day18_loops;
/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */


import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        //"This has multiple words" -----
        // 0123456789.....           >sentence.length =23



        int count = 0;
        //String sentence= input.nextLine();      //
        //sentence = sentence.trim();            // These two lines give the same result with method chain so method chain is the shortest way

        String sentence = input.nextLine().trim();        //METHOD CHAIN

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {            //how can I get each character of this sentece?
                count++;
            }

        }
        System.out.println("The count of words: " + (count + 1));    //to write words, I need spaces. So here we add + countecspaces because always sentence number is + of spaces
                                                                    // if we have 2 spaces we have 3 sentences.
    }
}