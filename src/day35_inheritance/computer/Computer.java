package day35_inheritance.computer;
//Superclass

public class Computer {

/*public Computer {   //  this is default ! it happens already, implicitly.

}
*/
    String os;
    int memory;
    public Computer (String os, int memory) {   //I created constructor
        this.os = os;
        this.memory = memory;
    }

}

