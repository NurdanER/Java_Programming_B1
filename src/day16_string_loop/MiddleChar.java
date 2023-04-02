package day16_string_loop;

public class MiddleChar {
    public static void main(String[] args) {
      /* if the number of characters are even print the middle two
      If the number of characters are odd print the middle one
       */

        String word = "California";  // 10 characters           //here middle one is 45
        //             0123456789

        boolean isEven = word.length()%2 == 0;

        if (isEven) {
            System.out.println(word.substring(word.length()/2-1, word.length()/2+1));  //   so here word.legth()/2 is 5 and  -1 is to get 4(I take two char because characters number is 10 and its even number), now I want to stop right after 5 so +1 we get the 6
        } else {                  //didnt print because number is even

            //"Californi";  // 9 characters
            // 012345678
            System.out.println(word.substring(word.length()/2, word.length()/2 +1)); //word.length()/2 is 4    and +1 to stop at 5 and 5 is not included  // 9/2 = 4
            System.out.println(word.charAt(word.length()/2));  // this is also fine if it is a single character !!!!!!!

        }

        word = "Califohellornia";
             // 012345678910......
        System.out.println(word.indexOf("hello"));  // 6       //hello starts with h and here index of h is 6 and gave me 6
        System.out.println(word.indexOf("quiz"));   // -1         //"quiz" word doesn't exist in that String so it will always return -1  //it is not available






    }
}
