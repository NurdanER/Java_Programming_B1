package day15_string;

/* Starts with;
Mr LastName         -sir  //Tittles        -"Hello Sir
Mister LastName
Ms LastName           -Ma'am
Dr LastName            -Doctor

Ends With;

Jr                     -Junior
Sr                     -Senior
 */

import java.util.Scanner;

public class Tittle {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name, with titles: ");

        String nameAndTitle = input.nextLine();  // MR LastName  --  Mr LastName  --  mr LastName

        //nameAndTitle = nameAndTitle.toLowerCase();

        nameAndTitle = nameAndTitle.toLowerCase();  // We are trying to have one version for different version inputs.  I don't care now how user writes I'll take it lowercase with this code.
        //If I wanted Uppercase so I had to write MR MISTER MS MADAM DR DOCTOR ABOVE IN THE PARANTHESIS


        if (nameAndTitle.startsWith("mr") || nameAndTitle.startsWith("mister")) {
            System.out.println("Hello Sir");
        } else if (nameAndTitle.startsWith("ms") || nameAndTitle.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (nameAndTitle.startsWith("dr") || nameAndTitle.startsWith("doctor")) {
            System.out.println("Hello Doctor");
        }



        if (nameAndTitle.endsWith("jr")) {
            System.out.println("Hello Junior");
        } else if  (nameAndTitle.endsWith("sr")){
            System.out.println("Hello Senior");
        }

            //wg=hat about user writer dr instead Dr?
    }
}
