package day18_loops;

   /*
        Palindrome: its the same reading from the beginning and end  ex; mom, abcba "neredesinden baslayip okursak ayni"

        Ex:
            mom
            racecar
            anna
            madam

        Task: Check if a word is palindrome

        Flow:
            declare some initial String
            how to reverse a String
            check if the reverse version is the same as the original
     */


public class PalindromeInterviewQuestion {

    public static void main(String[] args) {

        String word = "abcba";            //how can get get the last character? word.length()-1;
        String reverse = "";

        for (int i = word.length()-1; i >=0 ; i--) {     //how long I want my con top be repeat? as long as its not less than zero. //i>=0 because start pont is 0 and have to be equal 0 not less.
            //word.length()-1 is always index of the last char
            reverse+= word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("It is a palindrome word");
        } else {
            System.out.println("Not Palindrome");

        }











    }
}
