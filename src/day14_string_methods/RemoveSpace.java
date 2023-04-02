package day14_string_methods;

public class RemoveSpace {
    public static void main(String[] args) {

        String day = "   Thursday    ";     //here we have 15 characters     //The number of spaces; each counted as 1 // even empty space considered as 1
        //            012345678910111213141516
        int numOfBeforeTrim = day.length();
        System.out.println("numOfCharBeforeTrim = " + numOfBeforeTrim);

        day = day.trim();         //we remove spaces here.

        int numOfCharAfterTrim = day.length();
        System.out.println("numOfCharAfterTrim = " + numOfCharAfterTrim);


        String msg = "   Today we learned good String methods";        //msg = message
        System.out.println(msg.startsWith("Today"));                 //it is false because it starts with space not today.

        msg = msg.trim();
        System.out.println(msg.startsWith("Today"));               //true     because we removed spaces and starts with today now.
    }
}
