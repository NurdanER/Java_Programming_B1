package day14_string_methods;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String word1 = "last minutes";
        System.out.println(word1.isEmpty());      //false

        word1 = "";
        System.out.println(word1.isEmpty());              //true
        System.out.println(word1.isBlank());

        word1 = " ";
        System.out.println(word1.isEmpty());              //false                even space is a character, counted as 1!!
        System.out.println(word1.isBlank());              //true      blank method check String only has empty space


        word1 = "  y  ";
        System.out.println(word1.isEmpty());
        System.out.println(word1.isBlank());









    }
}
