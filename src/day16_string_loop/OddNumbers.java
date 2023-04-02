package day16_string_loop;

public class OddNumbers {
    public static void main(String[] args) {

        // int num = 2;
        //Print number from 2 to 100 which are odd numbers
        // while (num <= 100) {
        //System.out.println(num);
        // num++;
        // }

        int num = 2;
        while (num <= 100) {
            if (num % 2 == 1) {   //this gives odd numbers
                System.out.print(num + " ");
            }
            num++;


        }
    }
}
