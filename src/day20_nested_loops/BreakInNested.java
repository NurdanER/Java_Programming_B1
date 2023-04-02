package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {                                    // i =0                // i = 1                    // i=2                              //   i = 3

            System.out.println("i: " + i); //it runs 5 times

            if (i == 3) {               // here 4 times it stops at 3.  // ? i = 0 ? no print   is i=1? no so dont print    ? 2=3? no false I'm not gonna break   ?3==3 ? yes I'm gonna break and Im gonna stop
            break;

        }

            for (int j = 0; j < 2; j++) {                                                  // j=0                  j= 0                            j=0
                System.out.println("j: " +j);                                               //j=1                  j=1                            j=1



            }

            }





    }
}
