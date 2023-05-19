package day43_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//!!!!!!!INTERVIEW QUESTION!!!!!!!!!!

public class FrequencyOfCharacters {
    /*
        make a method that accepts a String, and returns a Map and stores that character as key and count each characters as a value. (since it will count it will be integer)
        Ex:     apple
            a - 1
            p - 2
            l - 1
            e - 1
     */

    public static void main(String[] args) {

        System.out.println(frequencyOfChar("apple"));    //we can call method name since in the same class we can call method name, but if it is in the different class we use class name
                                            //  01234
    }


    public static Map <String, Integer> frequencyOfChar (String str) {  // apple --- >split("")          //if we can call without object i can use static- since in the same class wwe euse only method name but in different class we call with class name

        Map <String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {   //GO  for THROUGH characters of the String
                                //5
            String key = str.charAt(i) + "";     //this String will hold each character on each cycle.

            if(map.containsKey(key)) {   //this method will return boolean if the given key exist among the keys in the map
                // First I check, if the character is already among the keys of the map, then get that key's value and increase it by one and update it.

                map.put(key, map.get(key) + 1);   //get the valuie of existing char and  update the value
                             // key= p value = 1  + 1 = 2

            } else {
                // If the character is NOT already among the keys of the map, then add it into the map by making its value just 1
                map.put(key, 1);   // ---->key = a  --->value= 1
                                    //----<key = p  --->value= 1
            }                       //----key = l   --->value = 1
                                    // ---key = e   --- value = 1


        }

        return map;
    }
}







