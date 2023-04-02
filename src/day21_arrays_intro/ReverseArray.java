package day21_arrays_intro;
/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1]
 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] original = {1, 2, 3, 4, 5};                   //has the same length-- 5
        //                 0  1  2  3   4   index numbers
        int [] reversed = new int [original.length];         //I dont care how many numbers they put later with original.length --5                //we reserve a spot
        //                     {0, 0, 0, 0, 0}    elements        becasuse we didnt give value yet
        //                      0  1  2  3  4     index numvers

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reversed));


        System.out.println("-------------------------");
        for (int i = original.length-1; i >= 0; i--) {
            //                             i = 7
            //                 8       -    (i + 1)
            //                             i = 6
            //                 8       -    (i + 1)
            //                             i = 5
            //                 8       -    (i + 1)
            //                             i = 4
            //                 8       -    (i + 1)
            //                             i = 3
            //                 8       -    (i + 1)
            //                             i = 2
            //                 8       -    (i + 1)
            //                             i = 1
            //                 8       -    (i + 1)
            //                             i = 0
            //                 8       -    (i + 1)
            reversed [ reversed.length -   (i +1)     ] = original[i];
            //        [        0        ]
            //        [        1        ]
            //        [        2        ]

        }


        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reversed));



       /* System.out.println("-------------------------------------------------");

        for (int i = original.length-1; i >=0; i--) {                 //we could write original as well doenst matter because they both have the same length

            //             5
           reversed[ reversed.length    -                      ] = original[i]          ;  //I start from the last element and going back to the start   //reversed [] I want this square bracelet to be dynamic
        }

        */













    }
}
