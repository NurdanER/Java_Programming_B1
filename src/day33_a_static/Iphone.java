package day33_a_static;

public class Iphone {
    String model;
    double price;
    /*
        static String company = "Apple";
    static String OperatingSystem = "Ios";
    static boolean appleDay = false;
     */

    static String company;
    static String OperatingSystem;
    static boolean appleDay;

    static {
        company = "Apple";
        OperatingSystem = "IOS";
        appleDay = false;
    }

        public Iphone (String model, double price) {
        this.model = model;
        this.price = price;


}

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
