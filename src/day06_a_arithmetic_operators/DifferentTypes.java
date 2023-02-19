package day06_a_arithmetic_operators;

public class DifferentTypes {


    public static void main(String[] args) {


        System.out.println(10 - 5); //5 one int types
        System.out.println(5 * 10); //50 two int types
        System.out.println(10.0 / 5); // 2.0   double is bigger than in thats why result is double.

        //When they are two different data types with aritmetic operators, the result is the whatever the biggest one.

        System.out.println(10 / 5.0);  // still 2.0 double becz double is bigger than int


        System.out.println(10 / 5.0); //result is still double cause double is bigger than int
        System.out.println(10.0 / 5.0);

        System.out.println((int)(10.0 / 5.0));  //exlicit casting I'm casting to int thats why result is 2 we're narrowing bigger to small

        System.out.println((double)(5 * 2));  //10.0
        //5.0 * 2

        System.out.println((double)(5 * 2));  //10.0
        // double (10) --> 10.0


        byte b1 = 5;
        short s1 = 6;

        System.out.println(b1 * s1);  //30
        System.out.println(b1 + s1);  //11
        //WHEN ONE IS BYTE ONE IS SHORT DATA TYPE > RESULT IS ALWAYS INT BY DEFAULT. with any kind of aritmetic operators






    }
}
