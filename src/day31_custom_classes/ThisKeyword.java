package day31_custom_classes;

public class ThisKeyword {

   // this vs this ()
    int a = 100;

    public ThisKeyword (int a ) {
        a = 400;                   //local variable
        this.a = a;               // java  prioritize instance variable over local variable

    }
}
