package day33_a_static;

public class BestBuy {
    //if we dont have object we can reach the instance variable


    String location;
    static String headQuarters = "Richfield, MN";             //we have only 1 headquarter at companies so made it with static

    static String day = "Sunday";
    static int numOfComputer = 100;


public BestBuy (String location) {
    this.location = location;
}
//=====================================================
    //This is an instance method which has return type as VOID and doesnt any arguments

public void openStore () {       //intance method
    System.out.println("Opening the " + location);

}
public static void reStock () {
    numOfComputer = 100;
    System.out.println(numOfComputer);
}
}
