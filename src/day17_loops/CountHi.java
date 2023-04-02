package day17_loops;

public class CountHi {
    public static void main(String[] args) {

        String sentence = "abaaaahiaaaahiaaaahiaaaahi";                      //icindeki hi lar kac tane bul
        //                 0123456......
        int countOfHi = 0;
        //                    a == h                         b == i                   //if both a and b  are equal it means it is hi
        //if (sentence.charAt(0) == 'h'  && sentence.charAt(0+1)=='i') {   so this is loop and it will continue till sentence.length and i is goingto be icremented
        //if (sentence.charAt(1) == 'h'  && sentence.charAt(1+1)=='i')         whever condition is true, with countofhi it will count the numbers of "hi"
        //if (sentence.charAt(2) == 'h'  && sentence.charAt(2+1)=='i')
        //if (sentence.charAt(3) == 'h'  && sentence.charAt(3+1)=='i')
        //                                                        ..
        //                                                        ..
        //                                                        ..
        //                                                        ..
                              //yukardaki tum process i loop automatically yapiyor
        

        for (int index = 0; index < sentence.length(); index++) {

            if (sentence.charAt(index) == 'h'  && sentence.charAt(index+1)=='i') {               //get every "hi" in the String
                countOfHi++;
            }

        }

        System.out.println("This is amount of hi you have: " +countOfHi);


    }
}
