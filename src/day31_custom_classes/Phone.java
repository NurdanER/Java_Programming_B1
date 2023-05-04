package day31_custom_classes;

public class Phone {
    String name;
    String brand;
    int memory;
    double version;

    //Create a constructor that accepts only ONE parameters which is name


    public Phone (String name) {
        this.name = name;

    }


    //Print another const that accepts two paramethers which re name and brand

    public Phone (String name, String brand) {
        this.name = name;
        this.brand = brand;
    }


    //Create another constructor accpets FOUR parameters which are name, brand , memory, version

    public Phone (String name, String brand, int memory, double version ) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    //


   /* @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                ", version=" + version +
                '}';

    */

    @Override
    public String toString() {
        String result = name;

        if (brand == null) {
            result += "\nBrand: Will be determined";
        } else {
            result += "\nBrand: " + brand;
        }

        if (memory == 0 ) {
            result += "\nMemory: Will be determined";
        } else {
            result += "\nMemory: " + memory;
        }

        if (version == 0.0) {
            result += "\nVersion: Will be determined";
        }else {
            result += "\nVersion: " + version;
        }

        return result;
}
}
