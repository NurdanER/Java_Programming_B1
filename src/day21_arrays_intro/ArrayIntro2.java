package day21_arrays_intro;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[5];      //0,1,2,3,4   I have 4 index number but I have 5 elemenst in this Array
        //whenever I say new keyword it is another object.

        // arr [5] = 30;    //ArrayIndexOutOfBoundException : Index 5 out of bounds for length 5


        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        //They all dont have values yet.
        int [] arr2 = new int[3] ;
        System.out.println(Arrays.toString(arr2));

        boolean[] arr3 = new boolean[2];
        System.out.println(Arrays.toString(arr3));

        String [] arr4 = new String[4];
        System.out.println(Arrays.toString(arr4));


        System.out.println("--------------------");

        arr[0] = 10;               //I gave it int datatype
        System.out.println(arr[0]);            //but my data type is double so output is 10.0
        arr[1] = 23.3;

        System.out.println(Arrays.toString(arr));               //we have  elements yukarda ilk ikisina deger verdik kalan 3 u 0.0(double) cikiyor

        arr[2] = -44.4;
        arr[3] = 100;
        arr[4] = 200;
        System.out.println(Arrays.toString(arr));             //here kalan 3 unu de value verdim.


        System.out.println("------------------------");
        String [] cities = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"};
        System.out.println(Arrays.toString(cities));
        cities[5] = "GaithBurg";
        System.out.println(Arrays.toString(cities));
        System.out.println(cities[2]);



        arr = new double[8];             //this is completely different object with the size of 8 elements  // it doesnt add 3 more     //all values are zero now because we havent give any value yet.
        System.out.println(Arrays.toString(arr));















    }
}
