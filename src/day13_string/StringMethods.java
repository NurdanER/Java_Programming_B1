package day13_string;

public class StringMethods {
    public static void main(String[] args) {
        // how to compare String values exactly --> use .equals()
        String name = "james";
        System.out.println(name.equals("james"));

        System.out.println("cat".equals("dog"));

        System.out.println(name.equals("James"));

        System.out.println(name.equalsIgnoreCase("James"));

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b)); // compares a object with b object

        System.out.println(a.equals("hello")); // compares a object with literal "hello" object

        System.out.println(a.equals("java"));

        System.out.println(name.length());

        // how to compare 2 strings ignoring case sensitiveness:

        String last = "today was fun";
        System.out.println(last.length());

        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));












    }
}
