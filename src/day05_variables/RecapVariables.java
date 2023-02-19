package day05_variables;

public class RecapVariables {

    public static void main(String[] args) {

        //Declare Variables

        byte numberOfCoffeeCup;
        double totalPriceOfCoffee;
        int totalStudentinClass;

        //We cannot print the variables if they dont have values.
        //System.out.println(numberOfCoffeeCup);
        // System.out.println(totalPriceOfCoffee);
        // System.out.println(totalStudentinClass);

        //Assign the values
        numberOfCoffeeCup = 2;
        totalPriceOfCoffee = 12.21;
        totalStudentinClass = 543;

        System.out.println(numberOfCoffeeCup);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentinClass);

        // 2 (times) * 543
        System.out.println(numberOfCoffeeCup + "*" + totalStudentinClass);


        //Declare and assign

        System.out.println();
        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("This is my temperature: " + temperature);
        System.out.println("This is day: "+ javaDays + "in java class");









    }
}
