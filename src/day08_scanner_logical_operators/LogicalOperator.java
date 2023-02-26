package day08_scanner_logical_operators;

public class LogicalOperator {

    /*
    In Math

        Q: give me a number bigger than 3 AND less than 7?

        A: 3 < myNumber < 7

            3 < 5             ---- > true
                5 < 7        ---- > true



        Q: give me a number bigger than 3 or equal AND less than 7 or equal?

        A: 3 <= myNumber <= 7


    In Java

        3 < myNumber < 7

        3 < nyNumber  AND  myNumber < 7         --- > &&  --- > it is called AND operator

     */

    public static void main(String[] args) {


        int num = 20;
        System.out.println(num > 5);  //true
        System.out.println(num < 10);  //false

        System.out.println(num >5 && num > 10); //true
        //                 true   &&  true        true

        /* false   false    false
        false       true    false
        true        false   false
        true        true     true
        false       false    false
         */



}
    }
