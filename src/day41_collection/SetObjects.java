package day41_collection;

import java.util.*;   // :I import all of them !!

//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;

public class SetObjects {
    public static void main(String[] args) {

        //LINK, SET : THESE INTERFACE: All the thing we put they are ordered.
        // Set doesnt allow duplicates.
        //HasSet is not in order !!!!!

        Set<String> set1 = new HashSet<>();            //where do you use your colection in framework: hashset browser tab. since it doesnt allow duplication its the best way store
        set1.add(null);
        set1.add("hello");
        set1.add("$5.0");
        set1.add("400");
        set1.add("hello");  //duplication I dont see first hello !!
        set1.add("%");
        System.out.println(set1);


          //linkedhashset is a data maintains insertion order
        //not ordered and doesnt allow duplicates.
        Set<String> set2 = new LinkedHashSet<>();   //sag click e bas, column selection mode a bas ve set2 secip hepsini adini degisebilirsin.
        set2.add(null);
        set2.add("hello");
        set2.add("$5.0");
        set2.add("400");
        set2.add("hello");  //duplication still not allowed. 
        set2.add("%");
        System.out.println(set2);


        //TreeSet doesnt allow null element !! gives exception. !!
        //not ordered and doesnt allow duplicate.
        //extend sortedset


        Set<String> set3 = new TreeSet<>();
        set3.add(null);
        set3.add("hello");
        set3.add("$5.0");
        set3.add("400");
        set3.add("hello");  //duplication still no
        set3.add("%");
        System.out.println(set3);


    }
}
