package day21_arrays_intro;
/*
Ask user the month number they want, print the month name

1--> January

12--> December

Assume only valid number are given, butr as a challenge you can handle invalid numbers

 */

import java.util.Scanner;

public class SelectMonths {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter which month number you want: ");
        int monthNum = input.nextInt();    //so here we start from 1

        String [] allMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("The number you entered represents this month: " + allMonths[monthNum -1]);           //but here index starts from 0 so no one gonna say tell me 0 of month. and we handle with -1
















    }
}
