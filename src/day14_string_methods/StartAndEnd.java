package day14_string_methods;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";


        boolean result1 = str.startsWith("App");                 //true it starts with string
        boolean result2 = str.startsWith("app");                 //false    case doesn't match exact same

        System.out.println("result1= " +result1);
        System.out.println("result2 = " + result2);

        System.out.println(str.startsWith("Apple"));          //true
        System.out.println(str.startsWith("Apples"));         //true
        System.out.println(str.equals("Apple"));               //false

        System.out.println(str.startsWith(" App"));           //false because of space in quatotain.
        System.out.println(           "App");                   //true because java is not space sensitive

        System.out.println();

        String sentence = "Today is Java day!";
        boolean end1 = sentence.endsWith("day!");     //true
        System.out.println("end1 = " + end1);

        boolean end2 = sentence.endsWith("day");    //false becaus eits doesn't end day, it ends with day!
        System.out.println("end2 = " + end2);

        System.out.println(sentence.endsWith("is Java day!"));  //true
        System.out.println(sentence.endsWith("ay!"));           //true




    }
}
