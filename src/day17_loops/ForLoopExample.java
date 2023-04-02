package day17_loops;

public class ForLoopExample {

    public static void main(String[] args) {

        // int num; // decleration (there is no value)
        // int num = 5; //  initialization / declaration and assigning value
        // num = 7;    //reassignment


        // initialization/                          condition                       iteration

        for (int i = 1;                             i <= 10;                         i++) {
            System.out.print(i + " ");
        }

        //How can I write this code with wile loop ?
        System.out.println();
        System.out.println("-------------------------------------------");
        int num = 1;
        while (num <=10){
            System.out.print(num +" ");
            num++;
        }






    }



}
