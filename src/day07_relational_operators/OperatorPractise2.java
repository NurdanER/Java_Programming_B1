package day07_relational_operators;

public class OperatorPractise2 {

    public static void main(String[] args) {
        int a = 1; // |0| 1 | 0 | -1

        int b = -a-- + a++ / -a-- * --a;
             // -1 + 0 / - 1 * -1 (I updated fist then write the value )
        System.out.println(a);
        System.out.println(b); //-4







    }
}
