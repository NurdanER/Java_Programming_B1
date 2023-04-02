package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }


        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.print(i + " ");
                break;
            }
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            break;
        }

        System.out.println("----------------------");
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }




      /*  for (int i = 0; i <=10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.print(i + " ");           //5 yok because if i is 5 TRUE, I dont print I want to continue so skip printing and go to condition.
           // break;             //whenever hits to break, loop stops

        }
*/







    }
}
