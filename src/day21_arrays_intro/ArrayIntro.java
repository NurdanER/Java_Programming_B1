package day21_arrays_intro;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // with normal way
        String city1 = "Fairfax";
        String city2 = "New York";
        String city3 = "Alexandria";
        String city4 = "Bethesda";
        String city5 = "Reston";
        String city6 = "Gaithersburg";


        System.out.println("----------------------------");
        //Declaring the arrays

        //String [] cities = {city1, city2,city3, city4, city5, city6};

        // String cities [] = {"Fairfax", "New York","Alexandria", "Bethesda", "Reston", "Gaithersburg"}; // Pay attention to square bracket [] location. This is another way to declare. but we use alttakini.

        String[] cities = {"Fairfax", "New York", "Alexandria", "Bethesda", "Reston", "Gaithersburg"};  // 6 elements


        // How can I reach each element ?
        System.out.println(cities[0]);              // String word = "java"
        System.out.println(cities[1]);              //                0123
        System.out.println(cities[2]);              // word.charAt (4); --- > Exception
        System.out.println(cities[3]);
        System.out.println(cities[4]);              //  {"Fairfax", "New York","Alexandria", "Bethesda", "Reston", "Gaithersburg"};
        System.out.println(cities[5]);              //      0            1         2              3           4            5
        //System.out.println(cities[6]);              //  cities[6] --- > Exception


        System.out.println("----------------------------");
        // How I can print all elements in array?

        System.out.println("All cities: " + cities[0] + ", " + cities[1] + ", " + cities[2] + " ......");

        // System.out.println(cities);    // This is NOT the way how we print all the elements in array. This show some kind of memory location

        //Arrays.toString(parameter);

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(cities).substring(1));                //to get one element inside arrays         we could use string because cities is also String.

        String allCities = Arrays.toString(cities);
        System.out.println(allCities);


        System.out.println(Arrays.toString(cities).substring(1, Arrays.toString(cities).length() - 1));


        System.out.println("----------------------------");


        // How do we get the number of elements in array
        System.out.println(cities.length);                                         //length of the element in array   // //without parenthesis I use length  /
        System.out.println(Arrays.toString(cities).length());                      //length of the characters it holds in array


























/*
//with normal way

        String city1 = "Fairfax";
        String city2 = "New York";
        String city3 = "Alexandria";
        String city4 = "Bethesta";
        String city5 = "Reston";
        String city6 = "Gaithersburg";
        //Declaring arrays

        //String [] cities2 = {city1, city2 , city3, city4, city5, city6};


        String [] cities = {"Fairfax ", "New York", "Alexandria", "Bethesta", "Reston", " Gaithersburg"}; //It has 6 elements

        String  cities3 []  = {"Fairfax ", "New York", "Alexandria", "Bethesta",  "Reston", " Gaithersburg"};    //another way writing arrays square bracket [] locatin can be after reference(cities3)

        //How can I reach element?

        System.out.println(cities[0]);                               // String word = "java";
        System.out.println(cities[1]);                                 //                0123
        System.out.println(cities[2]);                                //word.charAt(4); ---> Exception
        System.out.println(cities[3]);
        System.out.println(cities[4]);                     //{"Fairfax ", "New York", "Alexandria", "Bethesta", "Reston", " Gaithersburg"};
        System.out.println(cities[5]);                    //   0             1           2             3             4          5
       // System.out.println(cities[6]);                 // cities[6] --- > Exception



        System.out.println("-----------------------------");

        //How can I print all elements in array?

        System.out.println("All cities: " + cities[0] + ", " + cities[1] + ", " + cities[2] + ", " +cities[3] + ", " + cities[4] + ", " + cities[5] );

        //System.out.println(cities);                   //This is NOT the way how we print all the elements in array. This shows some kind of memory location.

        //Arrays.toString(parameter);


        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(cities).substring(1));           //to get one element inside arrays         we could use string because cities is also String.


        System.out.println(Arrays.toString(allCities));


        System.out.println("------------------------");

        //How do I get the number of the elements in arrays
        System.out.println(cities.length);             //without paranthesis I use length  //length of the element in array

     System.out.println(Arrays.toString(cities).length());    //length of the characters it holds in array

 */


    }


}
