package day20_nested_loops;
/*
    [IQ] Prime in range

    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.

    Ex:
        Input:
            50 --> I need to go number 1 from all the way to 50 so I need loop. = 1..........50
        Output:
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

 */

public class PrintNumbersInterviewQuestion {
    public static void main(String[] args) {

        int num = 50;


        for (int i = 2; i <= num; i++) {     //rule on primne number starts from 2 and ignore 1 because every number divisible to 1.    2,3,4,5,6,7..... How can I decide which one divisible?

            int count = 0;   // putting the counter inside the outer loop will reset it back to 0 on each iteration  of the OUTER loop
            // if (i % 1== 0 && i % i == 0 )   //if I put 4 also divisible to 2 so this doesnt work..

            // i = 7 it is two times divisible 1,7      i=8
            //How can I check my number 7 % 2    ?      8 % 2
            //                          7 % 3    ?      7 % 3
            //                          7 % 4    ?      7 % 4
            //                          7 % 5    ?        7 % 5
            //                          7 % 6    ?
            //                          7 % 7    ?
            // I need to do all these
            //I need inner loops

            for (int j = 2; j <= i; j++) {                //7 % 2 == 0   it is false > not is gonna happen            //inner loop
                if (i % j == 0) {                          //7 % 3 == 0
                    count++;                                        //.
                    //.
                    // 7 % 7 > true
                }


            }

            if (count == 1) {
                System.out.print(i + ", ");

            }            //This is where our inner loop ends


        }
    }
}
