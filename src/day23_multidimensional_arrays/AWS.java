package day23_multidimensional_arrays;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {

            String app = "amazon";
            String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

            String [] envArr = zones.split(",");      //4 elements
             // System.out.println(Arrays.toString(zonesArr));


                for (int i = 0; i <envArr.length; i++){
                System.out.println(app + " is being deployed to environment " + envArr[i] );
            }





        System.out.println("---------------------------");
        for (String eacEnv : envArr) {
            System.out.println(app + " is being deployed to the environment " + eacEnv);
        }












    }
}
