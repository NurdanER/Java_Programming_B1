package day19_nested_loops;
/*
Tekrar calis, tamamla.
 */

public class FrequencyOfCharacters {
    /*
    How many times used a
    How many times used p
    How many times used l
    How many times used e
     */
    public static void main(String[] args) {

      /*  String word ="applea";   //5 characters
                   //01234
        String unique = "";

        for (int i = 0; i < word.length(); i++) {          //do the loop going through the length of the word

            int count = 0;   //initialzing and declaring to 0     //I need this because i NEED HOW MANY TIMES EACH LETTER IN THATS WHY I'm starting from 0(zero)
            //if it matchec one time, that means that character is on there one time.
            char letter = word.charAt(i);       //each time I'm getting each char ,     i = 0 ----- > letter = a

           if (!unique.contains("" + letter)) {         //get each letter and if unique doesn't have it, add it.

               for (int j = 0; j < word.length(); j++) { // once added  I want to get the letter from string word = "apple"  and comparing itself
                   char eachLetter = word.charAt(j);
                                                                                       // true   false    false     false    false
                   if (letter == eachLetter) {          // comparing itself            a == a | a == p | a == p | a == l | a == e
                       count++;                      // I increase it one. It continues
                   }



               } // end of Inner Loop

               System.out.println(letter + " - " + count);
               unique += letter;




           }


        }

       */

        System.out.println("-----------");

        String word = "applea";   //5 characters
        //01234
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char letter = word.charAt(i);

            //I put "" because inside of paranthesis should be string. And it makes it String.
            if (unique.contains("" + letter)) {
                continue;    //when it reaches continues it is going to ignore the rest. I use this because I dont want to do for the repeated letters again and again
                //Once I count it, Thats it.
            }

            System.out.println();


        }

    }
}
