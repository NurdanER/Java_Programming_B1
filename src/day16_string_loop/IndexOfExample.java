package day16_string_loop;

public class IndexOfExample {

    public static void main(String[] args) {

        String str = "banana";  // .length(); --- >6  characters      //5 index numbers
//                    012345

        System.out.println(str.length());       //6
//        String firstChar = str.charAt(0);  // ---- >

        //get the first character
        String firstChar = "" + str.charAt(0);       //we put "" to make it String.
        System.out.println(firstChar);

        firstChar = str.substring(0, 1);   // reassigned  //this is the other var to get first char. basically I say Starts from 0 stop at 1 but 1 not included
        System.out.println(firstChar);

        // get the last  character of the word
        String lastChar = "" + str.charAt(str.length()-1);
        System.out.println(lastChar);

        // how can I get the last index of "n"
        System.out.println(str.lastIndexOf("n")); // -- > 4        //or if we are just looking char, one character we can write 'n' but unusual.














    }
}
