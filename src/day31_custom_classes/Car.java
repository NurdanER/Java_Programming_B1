package day31_custom_classes;

public class Car {

   /*
   create instance variables:
   model, year, color. fuel level (percent number)
    */

    String model;
    int year;
    String color;
    int fuellevel;


    @Override
    public String toString() {
        return "Car: " +
                "\nmodel= " + model  +
                "\nyear= " + year +
                "\ncolor= " + color  +
                "\nfuellevel=" + fuellevel;



                    /*
                        -fillTnak(): [void]
                         prints: filling tank
                        full level will be maxed at 100
                     */




    }
    public void fillTank () {
        System.out.println("filling tank");
        fuellevel = 100;
    }
}



