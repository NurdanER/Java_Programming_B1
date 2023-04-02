package day22_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        //I DIDNT UNDERSTAND
        String days = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";


        String [] dayArr2 = days.split("ay");   //split "ay" but dont use "ay !!
        System.out.println(Arrays.toString(dayArr2));
        System.out.println(dayArr2.length);


        System.out.println("---------------------");

        String [] dayArr3 = days.split("wednesday");     //its going to take all wednesday and not giong to priont wednesday   //whatever you gives in the paranthesis it splits that word and not print that word
        System.out.println(dayArr3.length);           //
        System.out.println(Arrays.toString(dayArr3));



        String month = "jan-feb-mar-apr-may-jun-july-aug-sep-oct-nov-dec";
        /*
        can we print each month
         */

        String [] monthArr = month.split("-");
        for (String eachMonth: monthArr) {
             //  System.out.println(eachMonth);
            // CAN YOU PRINT IT FIIRST LETTER OF EACH UPPER CASE AND REST LOWER CASE? Like Jan Feb March
            System.out.println(eachMonth.substring(0,1).toUpperCase() + eachMonth.substring(1) );

}














    }
}
