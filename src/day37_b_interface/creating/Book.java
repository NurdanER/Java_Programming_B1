package day37_b_interface.creating;

public class Book implements Create  {

    @Override
    public void read() {
        System.out.println("Reading the book");

    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}




//whenever I want to use Interface I use
//implements keyword