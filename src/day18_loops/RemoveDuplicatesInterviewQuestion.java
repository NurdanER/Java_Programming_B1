package day18_loops;
/*
Remove Duplicates
    Write a program that can remove duplicates from a String
     Ex:
    Input: abcaabc
    Output: abc
 */


public class RemoveDuplicatesInterviewQuestion {
    public static void main(String[] args) {
        String word = "abcaabcaabcaaaaadaaaaa";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {

            if (!unique.contains("" + word.charAt(i))) {   //'a' -- > ("" + 'a') ----? "a"   if unique container doesn't contain character we add that character.
                unique+= word.charAt(i);  // we are adding this
            }

        }


        System.out.println(unique);


    }
}
