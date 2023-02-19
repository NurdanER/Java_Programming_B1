package day06_a_arithmetic_operators;

public class TypeCasting {

    public static void main(String[] args) {

        byte b = 40;
        int i = b;  // the byte value is automatically converted to int, because byte is smaller than int.

        int i2 = 100;
        //byte b2 = i2;  //Reassigning check data types first. That is why we cannot put it this way.
        byte b2 = (byte)i2;   //Reassigning check data types first. With CASTINH we can put like this.

        byte b3 = 100;  //putting value directly gives a data type declared.

        System.out.println("b2: " + b2);
        System.out.printf("b3: " + b3);

        int i3 = 130;
        byte b4 = (byte)i3;  // -128 ............ 127 ===> After casting the data type, it check the value if it is the range.

        System.out.println("b4: " + b4);

        //char doldur



int i10 = 500;
long l1 = i10;  // int is smaller than long, so it will aut cast implicit-//

long l2 = 200;
int i11 = (int)l2;   // here the explicit is needed

        System.out.println();

double d = 50;
        System.out.println("d");


    }
}
