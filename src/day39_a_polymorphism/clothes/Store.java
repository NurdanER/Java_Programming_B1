package day39_a_polymorphism.clothes;
//runner class

import javax.naming.event.ObjectChangeListener;

public class Store {
    public static void main(String[] args) {

        //all possible references
        //Thirst class is reference type and it itself
        TShirt ts1 = new TShirt();
        ts1.wear();

        //the reference is----> super class

        Clothes c1 = new TShirt();
        c1.wear();


       // HasHood h1 = new TShirt(); //tshirt doesnt have a relation with hashood
        //tshirt doesnt implement hashood meaning there is no relation


        //the reference is----> interface.
        HasHood h2 = new Jacket();   //jacket has a relation with hashood
        h2.putOnHoodie();

        //reference is --> itself
        Jacket j1 = new Jacket();
        j1.putOnHoodie();
        j1.wear();


        //The reference type is ---> Superclass
        Clothes c2 = new Jacket();
        c2.wear();
        //since reference type is not interface, I cannot reach out tjat
        //c2.putOnHoodie();


        //Reference type is---- >Interface
        HasHood h3 = new Jacket();
        h3.putOnHoodie();
        //since the reference type is not superclass, I cannot reach
        //j3.wear();


        Object o = new Jacket();
        //object class is the super class of all class.

        //The reference is Object class, I canNOT access the
        //o.wear();     //anyting lower than object I cannot reach
        //o.putOnHoodie();


        }










    }

