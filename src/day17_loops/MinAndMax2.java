package day17_loops;

import java.util.Scanner;

public class MinAndMax2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //?whyyyyyyyyyy da why we give these numbers ters????

        int max = Integer.MIN_VALUE;   //because if (0<num=10) then new max = 10 !!                //int max = -279... that we have in java
        int min = Integer.MAX_VALUE;                                                        //int min = 279.....

        int count = 1;

        while (count <= 5) {

            System.out.println("Enter a number: ");
            int num = input.nextInt();             //if this new number is

            if (max < num) {
                max = num;   //it is num because whatever we give extra, its going to be max !!
            }

            if (min > num) {
                min= num;
            }
            count++;

        }


        System.out.println("Max: " + max);
        System.out.println("Min: " +min);











    }
}
