package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {


        /*for (int i = 0; i < 5 ; i++) {       //int i =0;   initialization    // i < 5 termination condition   // i++ update
            System.out.println("Hello Loop Academy");  // I want to print out this 4 times.
        }

         */


       /* System.out.println("------------------------");

        for (int i = 1; i <= 2; i++) {                //Outer Loop
            System.out.println("This is the number **** " +i+ " **** iteration");

            System.out.println("Hello World");
            System.out.println("Hello World");
            System.out.println("Hello World");

        */


            System.out.println("------------------------");

            for (int i = 0 ; i < 2; i++) {   //Outer Loop
                System.out.println("This is the number **** " +i+ " **** iteration");
                for (int j = 1; j <=3 ; j++) {
                    System.out.println("hello world");

                }



            }




          //  for (int j = 0; j < 5; j++) {          // Inner Loop   // since we declared first i in the first loop I cant declare i again so intteliJ gives me j in the second part.
                
            }
        }













