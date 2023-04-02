package day13_string;

public class RemoveSpaces {
    public static void main(String[] args) {
        String day = "       Thursday    ";
        int numOfCharBeforeTrim = day.length();
        System.out.println("numOfCharBeforeTrim = " + numOfCharBeforeTrim);

        day= day.trim();
        int numOfCharAfterTrim = day.length();
        System.out.println("numOfCharAfterTrim= " +numOfCharAfterTrim);


        String msg = "            Today we learned good String methods";
        System.out.println(msg.startsWith("Today"));              //false //here it starts with space above. so it doesnt start with string

        msg = msg.trim();     //"Today we learned good String methods"      so it starts with string so its true
        System.out.println(msg.startsWith("Today"));       //true
















    }
}
