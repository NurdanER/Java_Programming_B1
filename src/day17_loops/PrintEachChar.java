package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {

        //I want to take java

        //with String
        String str = "java is a great language";                 // ------>length is 24
        //            0123


        System.out.println(str.charAt(0));            //j
        System.out.println(str.charAt(1));            //a
        System.out.println(str.charAt(2));            //v
        System.out.println(str.charAt(3));            //a
        //                                              .
        //                                              .
        //                till 24                       .


        //How can I it with loop?
        System.out.println("----------");
        for (int i = 0; i < str. length(); i++) {            //I want to loop until when?; its length   //if I do it with = I have to say i<= str.length ();-1
            System.out.println(str.charAt(i));    //I take char
        }



















    }
}
