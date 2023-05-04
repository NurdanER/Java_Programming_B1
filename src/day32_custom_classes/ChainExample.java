package day32_custom_classes;

public class ChainExample {
    public ChainExample () {
        System.out.println("First");
    }
    public ChainExample (int i ) {
        this();
        System.out.println("Second");

    }

    public ChainExample (String s) {
        this(12);
        System.out.println("Third");
    }

    public ChainExample (double d) {
        this("test");   //we cannot have more than one and it has to be in the first line
        System.out.println("Fourth");
    }













    }

