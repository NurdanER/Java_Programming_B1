package day31_custom_classes;

public class UsingTrafficLight {
    public static void main(String[] args) {

        TrafficLight lightOne = new TrafficLight();     //This constractor default value is already there

        lightOne.color = "Red";    //initializing the instance variable
        System.out.println(lightOne.color);


        TrafficLight lightTwo = new TrafficLight("Green");    // you have a comstractor, to use variable. I gace value directly
        System.out.println(lightTwo.color);

        TrafficLight lightThree = new TrafficLight("Yellow");
        System.out.println(lightThree.color);








    }
}
