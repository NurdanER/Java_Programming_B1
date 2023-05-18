package day41_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {

        ArrayList <String> list1 = new ArrayList<>();     //reference is -ITSELF
        List<String> list2 = new ArrayList<>();     //reference is -Interface  because List is Interface
        //                                          //reference side is List interface but object side is ArrayList class
        list2.add("a"); //0     //it reserves indexes
        list2.add("b"); //1
        list2.add("c"); //2
        list2.add("d"); //3
        list2.add(null); //4  //since it is string we can add null.
        list2.add("a"); //ArrayList accepts duplicates!!
        System.out.println(list2);
        System.out.println(list2.get(2));

        //ArrayList uses dynamic in the background. (I dont need to know how.)
        //It implements List interface
        //ArrayList uses internally array.
        //ADD, REMOVE: This methods works slower comparing to the others because it has to go through manipulation and copying the arrays.!! but we still don't see it.



        //LinkedList uses doubly linked list. It has starter point and next pointer.
        //Since they dont use indexes Inserting and deleting elements are faster.
        List<String> list3 = new LinkedList<>();    //reference is -Interface  because List is Interface

        list3.add("a"); //0     it reserves indexes
        list3.add("b"); //1
        list3.add("c"); //2
        list3.add("d"); //3
        list3.add(null); //4  //since it is string we can add null.
        list3.add("a"); //ArrayList accepts duplicates!!
        System.out.println(list3);
        System.out.println(list3.get(2));


        //Vector internallly uses array.
        //It is synchronized (thread-safe).

        List<String> list4 = new Vector<>();    //reference is -Interface  because List is Interface

        list4.add("a"); //0     it reserves indexes
        list4.add("b"); //1
        list4.add("c"); //2
        list4.add("d"); //3
        list4.add(null); //4  //since it is string we can add null.
        list4.add("a"); //ArrayList accepts duplicates!!
        System.out.println(list4);
        System.out.println(list4.get(2));

        //MAIN DIFFERENCE IS ARRAYLISYUSES ARRAY INTERNALLY
        //GET: READING FROM ARRAYLIST IS FASTER
        //VECTOR USES ARRAY INTERNALLY BUT TREAT SAFE. IT CANNOT REACH DIFFERENT ELEMENTS AT THE SAME TIME.
        //LINKED LIST DOESNT USE INDEXES THATS WHY DELETING ELEMENTS ARE FASTER.











    }
}
