package day06_b_unary_operators;

public class IncrementExample {

    public static void main(String[] args) {

      int x = 0;
        System.out.println(x);   //0

        x= 4;
        System.out.println(x); //4


        x = x + 1;
        System.out.println(x);  //5 most updated value

        // ++ ----> increment

        x++; // x = x + 1;  // post increment

        System.out.println(x);  //6

        ++x; //pre increment

        System.out.println(x++);  //
        System.out.println(x);
    }
}
