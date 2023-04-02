package day22_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
       int [] a = {1, 2, 3, 4};
       int [] b = {1, 2, 3, 4};
       int [] c = a;

     //   System.out.println(a == b);      //array is object this wont work because these are different object

        System.out.println(Arrays.equals(a, b ));             //gives true or false

        boolean result = Arrays.equals(b, c);
        System.out.println(result);


    }
}
