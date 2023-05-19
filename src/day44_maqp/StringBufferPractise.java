package day44_maqp;

public class StringBufferPractise {
    /*
   StringBuffer
        It is also an object that represent sequence fo Characters
        It is also MUTABLE, once the object is created CAN be modified
        StringBuffer is synchronized-thread safe
        We can create StringBuffer only by "new" keyword.
        It is also coming from java.lang package
     */
    public static void main(String[] args) {
      /*  String vs StringBuilder vs StringBuffer



        IQ:  What is the difference amoong String, StringBUilder, StringBUffer?
        A:

        String
        It IMMUTABLE
        There are two ways we can declare a String
                -By literals
                -By new Keyword



        StringBuilder
        It is also an object representation of sequence of characters
        StringBuilder is mutable and CAN be modified
        It is NOT synchronized-NOT thread sage
        We can ONLY create object of StringBuilder by the "new" keyword.
                It is coming from java.lang package




        StringBuffer
        It is also an object that represent sequence fo Characters
        It is also MUTABLE, once the object is created CAN be modified
        StringBuffer is synchronized-thread safe
        We can create StringBuffer only by "new" keyword.
                It is also coming from java.lang package

       */
        StringBuffer stringBuffer = new StringBuffer("Test");
        System.out.println(stringBuffer.capacity());

        System.out.println(stringBuffer.indexOf("st"));


        stringBuffer.append("stststst");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.lastIndexOf("st"));

        stringBuffer.reverse();
        System.out.println(stringBuffer);

    }
}
