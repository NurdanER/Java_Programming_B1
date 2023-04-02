package day16_string_loop;

public class PrintNumbersWithLoopIf {
    public static void main(String[] args) {
        int n= 2;
        while (n <= 100) {          //n=2     //checking my if condition; is 2%2 == 0 ?-- TRUE  then print statement then n++;
                                    //n=3     //checking my if condition; is 2%2 == 0 ?-- FALSE  then SKIP IF Statement then n++;
                                    //n =4   //checking my if condition; is 2%2 == 0 ?-- TRUE  then print statement then n++;
                                    //n=5    //checking my if condition; is 2%2 == 0 ?-- FALSE  then SKIP IF Statement then n++;
                                    //.
                                    //.
                                    //.
                                    //n=100     //checking my if condition; is 2%2 == 0 ?-- TRUE  then print statement then n++;
                                    //n=101     LOOP STOPS N<=100
            if (n % 2 == 0) {
                System.out.println(n);         //n= 2
            }
            n++;            //I'm inside of the while loop and check if condition but I'm outside of the if statement.
        }


    }
}
