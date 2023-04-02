package day16_string_loop;

public class Factorial {
    public static void main(String[] args) {
        /*

        Q: What is the Factorial 4 ?
        A: 4! = 4 * 3 * 2 * 1

         */

        int num = 5;   //here num starts from 5 and with post decrement (num--) decrease by one by.

        int result = 1;

        while (num > 1) {
            System.out.println(result + "* " + num);
            result *= num;
            num--;
        }

        System.out.println(result);








    }
}
