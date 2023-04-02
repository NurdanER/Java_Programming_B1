package day16_string_loop;

public class MethodChaining {
    public static void main(String[] args) {

      String word = "         Java is a great language      ";
        System.out.println(word);

        word = word.trim();      //"Java is a great language"
        //                          0123456......
        System.out.println(word);


        //word = word.substring(0, 4);
        word = word.substring(0, word.indexOf(""));   //this is more dynamic.   it starts from 0 and stops before first space.
        System.out.println();

        System.out.println("--------------------");

         word = "         Java is a great language      ";
        System.out.println(word);

        word = word.trim().substring(0, word.indexOf(""));          //first trim word then take java word
        System.out.println(word);


        System.out.println("--------------------");

        word = "         Java is a great language      ";
        System.out.println(word);

       // word = word.trim().substring(0, word.indexOf("").toLowerCase);)   //doestn work with dynamic code becasue
        String word1 = word.trim().substring(0, 4).toUpperCase().toLowerCase();   //now it works because all method returs STRING
       // String word2 = contains("ja").word.trim().substring(0, 4).toLowerCase().toUpperCase();    //first one contains method return the boolean so gives error.
       // String word3 = word.indexOf(1) + "Hello";        // here we made it String with concatination so it returned String
        System.out.println(word1);























    }
}
