package day15_string;

public class MergeString {
    public static void main(String[] args) {

        String word1 = "abc";
        //              012      //3 character has last index is 2.     // to find the last char ---> word1.charAt(sentence.length()-1);
        String word2 = "xyz";
        //              012
        String mergeOne = word1 + word2;
        System.out.println(mergeOne);

        String mergeTwo = "" + word1.charAt(0) + word1.charAt(1);
        System.out.println(mergeTwo);

        mergeTwo += word1.charAt(2);  //shorthand operator we're adding.
        mergeTwo += word2.charAt(0);
        mergeTwo += word2.charAt(1);
        mergeTwo += word2.charAt(2);
        System.out.println(mergeTwo);

    }
}
  //mergetwo = abcxyz