package day16_string_loop;

public class HelloWorldLoop {
    public static void main(String[] args) {
        System.out.println("Hello World");            //I  don't want to write these 5 times again and again.
        System.out.println("Hello World");           //In "Java" I need to avoid repeating actions.
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");


        System.out.println("------------------------");
        System.out.println();


        int num=1;                  // here            //each cycle of the code is ITERATION.
        while (num<=5) {          //num=1  // IS NUM <=5 ? --YES ! // THEN PRINT STATEMENT BELOW! AND ICREMENT NUM +1
            //                    //num= 2 (incremented num)// IS NUM <=5? --YES!!  // THEN PRINT STATEMENT BELOW! AND ICREMENT NUM +1
            //                   //num= 3 (incremented num)// IS NUM <=5? --YES!!  // THEN PRINT STATEMENT BELOW! AND ICREMENT NUM +1
            //                  //num= 4 (incremented num)// IS NUM <=5? --YES!!  // THEN PRINT STATEMENT BELOW! AND ICREMENT NUM +1
            //                 //num= 5 (incremented num)// IS NUM <=5? --YES!!  // THEN PRINT STATEMENT BELOW! AND ICREMENT NUM +1
            //                //num= 6 (incremented num)// IS NUM <=5? --NO!!  // THEN STOP LOOP !!
            System.out.println(num + ") Hello World");
            num++;                     //WE HAVE TO PUT THIS POST INCR BECAUSE IF WE DON'T PUT ITS INFINITIVE LOOP AND DOESNT STOP!!
        }










    }
}
