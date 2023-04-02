package day15_string;

public class CharMethod {
    public static void main(String[] args) {

        String  word = "loop"; // 4 characters
        //              0123           //last index number is gonna be 1 less than actual character.


        System.out.println(word.length());  //gives me 4 because we have 4 characters

        // a method which returns us a char on a given INDEX - charAt(int);

        System.out.println(word.charAt(0));         //its goig to pront l
        System.out.println(word.charAt(1));         //it is going to print o
        System.out.println(word.charAt(2));        //it is going to print o
        System.out.println(word.charAt(3));        // it is going to print p



       // System.out.println(word.charAt(4));     This 4 out of range. index starts with 0.

        System.out.println("------------------------------------------");

        String longWord = "sdgkjdfhfdxgkjhdfgkjhfdkjhfkdjghkfdjfkdga";
        //                 0123                                        40

        System.out.println(longWord.length());             //length is 41

        int lastIndex= longWord.length()-1;                     //last index is always -1 because index starts from 0.
        System.out.println(longWord.charAt(lastIndex));    //so here char gives me the character based on the number we give string to check at String index. returns char





    }
}
