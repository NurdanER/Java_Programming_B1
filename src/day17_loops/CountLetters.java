package day17_loops;

public class CountLetters {
    public static void main(String[] args) {

        String word = "aabbcca";  //"loop is great. loop is amazing"
        //             0
        char letter = 'a';           //"loop"

            int countOfLetterA = 0;


        for (int i = 0; i < word.length(); i++) {         //

            if (word.charAt(0) == letter) {            //with 0 I got only a, I want to get them all so; yukarida for loop kullaniyorm
                countOfLetterA++;
            }
        }


            System.out.println("Count of Letter a is: " + countOfLetterA);






    }
}
