package day37_a_abstraction.exercise;
//Runner class

import javax.crypto.spec.PSource;

public class Gym {
    public static void main(String[] args) {

    //even if you have a contructor we still cannot create object
   // Exercise obj1 = new Exercise();

        Running obj2 = new Running("Running");
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(10));

}

}

