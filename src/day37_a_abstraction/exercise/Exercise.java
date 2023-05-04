package day37_a_abstraction.exercise;

public abstract class Exercise {

    //these are my abstract methods in abstract class
    final String name; //final instance ok.
    // We can call it from the child class

    public Exercise (String name) {
        this.name = name;

    }
    public abstract void performExercise ();

    public abstract int getCaloriesBurned(int minutes);



    }
