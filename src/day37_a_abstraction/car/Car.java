package day37_a_abstraction.car;

public abstract class Car {

    //Abstract method has to be in abstract class
    //I cannot have abstract method in NON_ABSTRACT class.
    public abstract void start(); // it tells you what youre gonna do but
                                  //doesnt say how youre gonna do



}

/*

  SO FAR:

     -ABSTRACT method does NOT have body
     -Abstract method tell WHAT it does but not HOW
     -Abstract method HAS TO BE in abstract class
     -Whatever class extends ABSTRACT class HAS TO implement ABSTRACT class
     -The FIRST NON-ABSTRACT HAS TO IMPLEMENT all the abstrac class.
     -Abstract Class canNOT be instantiated / object cannot be created.
 */
