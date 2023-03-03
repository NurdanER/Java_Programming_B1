package day10_a_if_statements;

public class TernaryExample {
    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;

        if (a % 2 ==0) {
           evenOrOdd = "Even";
        }else {
            evenOrOdd = "Odd";
        }

        System.out.println(evenOrOdd);
        System.out.println("---------------------------");


       a = 8;             //It is another way to write if else statement

       evenOrOdd = (a % 2 == 0) ? "Even" : "Odd";       //these two have to be always the same data type !!
        System.out.println(evenOrOdd);



    }
}
