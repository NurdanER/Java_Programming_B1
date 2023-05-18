package day40_exception.learn;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First Line");

        String word = "Java";
        System.out.println(word.charAt(0));

        try {
            System.out.println(word.charAt(10));   //runtime exception. //Unchecked exception. It stops the compile.        //how can I handle?     // I use try& catch bllocks //I use exception in the this block
        } catch  (Exception e ) {   //exception class name(parent of all compile exception) e reference name  //    Person person = new Person ();  // Peson is class name and person is reference name
            System.out.println("Exception Handled");
        }
             //okay there was

            System.out.println("Last line");



    }
}
