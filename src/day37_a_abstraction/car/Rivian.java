package day37_a_abstraction.car;

public class Rivian extends ElectricCar {



    @Override
    public void start() {
        System.out.println("This starts by voice control");

    }

    @Override
    public void charging() {
        System.out.println("Started by voice control");

    }
}
