package day14_string_methods;

public class RecapMethods {
    public static void main(String[] args) {

        String str1 = "loop"; //we made String object by LITERALS
        String str2 = new String ("loop"); // we made a String object by new keyword

        System.out.println("Compare with == " + (str1 == str2)); //false
        System.out.println("Compare with .equals() " + str1.equals(str2)); //true

        System.out.println("Compare with .equals() " + str1.equals("LooP"));  //false
        System.out.println("Compare with .equalsIgnoreCase()" + str1.equalsIgnoreCase("LooP"));   //true
        System.out.println();

        String word1 = "loop academy";
        System.out.println("To upper case: " + word1.toUpperCase());
        String word2 = "LOOP ACADEMY";
        System.out.println("To lower case: " + word2.toLowerCase());



        System.out.println("-------------------------------");

        String s = "pen"; // s is a String literal, so it is in the String pool
        String s2 = new String("pen"); // s2 is object in the heap, because we used new

        System.out.println("Compare with == " + (s == s2));          //false because location is different.
        System.out.println("Compare with .equals() " + s.equals(s2));  //true because both String value is the exact same

        System.out.println("compare with .equals() " + s.equals("Pen"));  //false they are not exact same
        System.out.println("compare with .equalsIgnoreCase() " +s.equalsIgnoreCase("Pen")); //true because ignored case sensitiveness.

        System.out.println();

        boolean isSame = s.equalsIgnoreCase("PEN");

        if(s.equals("pen")){

        }

        int len = s.length();
        System.out.println(len);

        System.out.println(s.length());

        // int a = 9;
        // a.length() -> invalid
        // a.equals() -> invalid

        if(s.length() > 4){
            System.out.println("long word");
        } else {
            System.out.println("short word");
        }

        System.out.println();

        System.out.println(("aaaa").length());
        System.out.println(("aa aa").length());



















    }
}
