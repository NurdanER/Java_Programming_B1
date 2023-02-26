package day04_variables;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        byte age = 50;
        System.out.println(age);  //dynamic. It changes automatically. Changes easily.

        age = 40;
        System.out.println(age);

        byte age2 = 80;
        System.out.println("age2");
        System.out.println(age2);  //using variable name ; you can use variable name without double quate

        age2 = age;  //since we declared age2 above
        System.out.println(age2); //console sonuc 40 because java always take the last update.

       // age2 = 55;

        byte age3 = age2;
        System.out.println(age3);

        








        System.out.println("1");

    }
}
