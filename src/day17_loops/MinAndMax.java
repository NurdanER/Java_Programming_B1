package day17_loops;
/*
FIRST PART;
write a program that asks user to enter 5 numbers and
SECOND PART
returs the biggest and smallast numbers from these 5
 */

/*

              repeated steps:
              ask for a number
              check is it the biggest
              check is it the smallest

 */

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println(smallest);
        //System.out.println(biggest);

        int count = 1;

      //  int smallest = Integer.MIN_VALUE;             //SECOND PART       //IN jAVA when you put Integer.Min Value it is the smallest
      // int biggest = Integer.MAX_VALUE;             //IN jAVA when you put Integer.Max Value it is the biggest

        System.out.println("Enter a number: ");   //here we asked 1 time
        int num = input.nextInt();

        int smallest = num;
        int  biggest= num;

        while (count <= 4) { //I want to repeat this 5  times. How? FIRST PART  //here the rest 4 times

            smallest = num;
            biggest= num;


            if(num > smallest){
                smallest = num;
            }

            if (num< biggest) {
                biggest = num;
            }

            count++;

        }


        System.out.println(num);








    }
}
