package day20_nested_loops;
/*
we are finding the duplicate ones

    Create a class called DuplicateCharacters in your Practice_Programming project and inside the day19_tasks package

        Task:
                    Given a String, find and print the duplicate characters.
                    A character is duplicate if it appears more than once in the String.
                        Ex:
                            AAABCCDEEF
                        Output:
                            ACE
 */

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        String uniqueChar = "";


        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            if (uniqueChar.contains("" +str.charAt(i))) {   // if my uniqueChar contains the same dont print      // "" we used this to make it String because in paranthewsis it need String
                continue;
            }

            //I need to get each character
            //inner looop I need to compare each them.


            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    //my condition how many times they counted
                    count++;
                }

            }

            if (count > 1) {           //if counts more than one
                System.out.print(str.charAt(i));         //print them out then

            }
              uniqueChar+= str.charAt(i);          //"" + A + A +A + B + C+ C +D +E+ E+ F

        }


    }
}