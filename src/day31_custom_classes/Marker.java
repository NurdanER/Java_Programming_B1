package day31_custom_classes;

public class Marker {    //instance method


    String type;         //instance variable
    String brand;
    String color;


    public Marker(String inputType, String inputBrand, String inputColor){  //paramethers constractor

        type = inputType;      //local variable
        brand = inputBrand;
        color = inputColor;


       // public Marker () {       //constractor overloading

        //}
    }

    @Override
    public String toString() {
        return "Marker{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    /*
     // The local variables type, brand and color are not getting assign to instance variables type, brand, color automatically like this. We still need to assign them in the body of the constructor.
        public Marker (String type, String brand,  String color) {
        }
     */
}
