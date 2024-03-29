package day07_relational_operators;

public class AgeGroup {
/*
    declare and assign an age variable

    check if the person is a kid
        age --- > up 13 (include 13)

    check if the person is adult
        age --- > 30 or higher
 */
    public static void main(String[] args) {

        int age = 13;

        boolean isKid = age<= 13; //value has to be true or false ALWAYS
        System.out.println("You're a kid. Correct? " +isKid);

        System.out.println();

        boolean isAdult = age>=30;
        System.out.println("You are an adult. Correct? " + isAdult);

    }
}
