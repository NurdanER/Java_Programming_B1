package day37_a_abstraction.car;


public class Tesla extends ElectricCar {
    //this starts  by the card
    @Override
    public void start() {
        System.out.println("Started by card");


    }

    @Override
    public void charging() {
        System.out.println("Tesla is charging by plugin");

    }


}

//whenever I want to use abstract I use extends keyword !!