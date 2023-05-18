package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Waaring Jacket");

    }

    @Override
    public void putOnHoodie() {
        System.out.println("Putting the hoodie on");

    }
}
