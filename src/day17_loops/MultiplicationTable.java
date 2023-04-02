package day17_loops;
 /*

    Task:
        declare and assign a number

        print all the multiplication results for 1 through 10

        Ex:
            4

            4 x 1 = 4
            4 x 2 = 8
            ..
            4 x 10 = 40

 */

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 3;                                                                 //int=0   //i=0+1=1    //i=1+1=2 ......
        for (int i = 0; i < 10; i++) {               //I put 10 because carpim tablosu 10 da bitiyor.
            System.out.println(num + " * " + i + " = " + (num *i));           //3 * 0 = 0
                                                                              //3 * 1 = 3
                                                                              //3 * 2 = 6
            // ...........                                 //its going to continue like that till 10.
            
        }

        


















    }

}
