package day13_string;



public class UpperOrLower {
    public static void main(String[] args) {

       char letter = 'A';     //'a'------ > 97 I'm going to convert this "A" I need minus

       //lower case  range --->97 -122
        //upper case range --->65 - 90
        //there is a difference about 32 between lower and upper case

        if (letter >= 97 && letter<= 122) {
            System.out.println("You entered letter: " +letter + "\nYour converted letter: " + (char) (letter - 32)); //here I have to do casting. because result is going to be int but I need char.
        }else if (letter >= 65 && letter<= 90) {  System.out.println("You entered letter: " +letter + "\nYour converted letter: " + (char) (letter + 32));

        }












    }
}
