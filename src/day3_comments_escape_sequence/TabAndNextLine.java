package day3_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {
        //This is without any tab
        System.out.println("This is not tabbed");


        System.out.println("\tThis is tabbed once");

        //This is with two tab
        System.out.println("\t\tThis is tabbed twice");

        //Here is tabbed without escape sequence
        System.out.println("        This is tabbed without escape sequence.");
        System.out.println();

        // example of new lines

        System.out.println("1)go to parking lot");
        System.out.println("2)find the car");
        System.out.println("3)start the car");

        System.out.println("\n1)go to parking lot\n2)find the car\n3)start the car");







    }
}
