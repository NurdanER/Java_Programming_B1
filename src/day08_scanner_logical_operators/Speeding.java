package day08_scanner_logical_operators;

public class Speeding {

    /* Declare 3 variables:

    Speed limit
    speeding

    print
    "Is this person speeding?" true or false
    */

    public static void main(String[] args) {

        int currentSpeed = 0;
        int speedLimit = 65;
        boolean isSpeeding = currentSpeed >= speedLimit;

        System.out.printf("Is this person speeding?" + isSpeeding);

                /*if the requirement is not clear , ask the question
                in this case what 65 shoulf be considered?
                as higher or lower than speed limit

                -65 or lower not speeding
                +65 or higher is speeding
                 */










    }





}
