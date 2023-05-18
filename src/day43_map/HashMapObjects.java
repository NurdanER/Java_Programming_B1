package day43_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjects {
    /*//
    *MAP is a seperate collection type and doesnt have inheritance
    *Collection of pairs (Key + Value)
    *KEY side canNOT be DUPLICATED !! it has to be unique .
    * VALUE can be duplicated.
    *HashMap-- doesnt quarantee order.! Its random order.!
    *LinkedHashmap in order
    *TreeMap is sorted extend SortedSet
    *It prints with curly bracelet.
    * Accepts null value as a key.
    *

     */
    /*

       HashMap
        -Key - does not accept duplicates
        -Value - accepts duplicates
        -Order is not guaranteed.

            -put(key, value);
            -get(key);
            -remove(key);
            -containsKey(key);
            -containsValue(value);
 */



    public static void main(String[] args) {
        //   -key    -value      (key value together ENTRY SET)        //It has 2 data types.
        Map<Integer, String> map = new HashMap<>() ;

        //put(k, v);-------> since MAP doesNOT duplicate, this method puts the data into map, but if there is already existing in the map,
        // it will UPDATE the value of the key
        map.put(1, "one");  //first time, there was no key or value. This is why it added into the map.
        map.put(1, "one");  //second time, the key which 1 already exist, it did not add it.
        map.put(1, "one");  //third time, the key which 1 already exist, it did not add it.
        map.put(1, "two");  //fourth time, since key which is 1, already exist, and since duplicate is NOT allowed, it updated the alreadt existing key's value.

        System.out.println(map);

        System.out.println("===================================");

        Map<Integer, String> map2 = new HashMap<>() ; //hasmap is not in order. it is random.
        map2.put(1, "one");
        map2.put(5, "five");
        map2.put(10, "ten");
        map2.put(4, "four");
        System.out.println(map2);


        System.out.println("===================================");

        //read the key value

        System.out.println(map2.get(5)); //argument in the get method which is 5 is NOT the index, it is the KEY.
        System.out.println(map2.get(2)); //If you try to get the key which does NOT exist, it will return 'null'

        String value = map.get(4); // Since it returns String, I can ASSIGN it to a String variable.
        System.out.println(value);

        System.out.println("***************");
        map2.remove(1);  // the argument in the remove() method is key, if there is matching one, it will remove whole ENTRY SET (key-value)
        System.out.println(map2);


        System.out.println("***************");
        System.out.println(map2.containsKey(1)); // it checks if the given KEY exist in MAP
        System.out.println(map2.containsKey(4));


        System.out.println("***************");
        System.out.println(map2.containsValue("five"));  // it checks if the given VALUE exist in MAP
        System.out.println(map2.containsValue("six"));


        System.out.println("***************");
        map2.put(null, null);   // The HashMap can have a null as key and as value
        System.out.println(map2);

        map2.put(null, "java");
        System.out.println(map2);

        map2.put(6, null);
        System.out.println(map2);

        map2.put(7, null);
        System.out.println(map2);  // We can have duplicate values

        map2.put(8, "Bye");
        map2.put(9, "Bye");
        System.out.println(map2);

        map2.put(8, "BYE");
        System.out.println(map2);


    }

}





















