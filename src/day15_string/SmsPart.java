package day15_string;
   /*[SMS parts]
           Given a String in the following format:
           “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
        Separate these parts and print them separately: Sender: actualSender
        Number: actualNumber Message: actualMessage”
        */

public class SmsPart {
    /*
    [SMS PARTS]
    Given a String in the following format:
    "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving} ";
    Seperate these parts and print them seperately: Sender: actualSender
    Number: actualNumber Message: actualMessage"

     */
    public static void main(String[] args) {


       String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving} ";

        int sendStart = msg.indexOf("<")+1;
        int sendEnd = msg.lastIndexOf(">");      //> it has only one so we can say last
        String name = msg.substring(sendStart, sendEnd);                //substring works with numbers so we gave int numbers yukarda


        System.out.println(name);


        int numStart= msg.indexOf("[")+1;
        int numEnd = msg.indexOf("]");
        String number = msg.substring(numStart, numEnd);
        System.out.println(number);

        int msgStart = msg.indexOf("{")+1;
        int msgEnd = msg.indexOf("}");
        String message = msg.substring(msgStart, msgEnd);
        System.out.println(message);

















    }
}
