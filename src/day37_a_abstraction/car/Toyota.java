package day37_a_abstraction.car;

public class Toyota extends Car {


    @Override  //make sure it is overrride
    public void start() {
        System.out.println("Insert a key");  // I have to have implemantation
        System.out.println("Start the car by turning the key");
    }
}
