package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {


        String [] str = {"java", "loop", "while", "Softskills", "HELLO", "bye", "$", "54TEst"};
        System.out.println(Arrays.toString(str));       //char comes first then number than capital letters than lowercase

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));



    }
}
