package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String str = "loop";    //4 characters // 3 index numbers
        //            0123

        System.out.println(str.indexOf("l"));        //it takes l  returns and gives its index number of that string. here l is the first char and index of string always start with 0
        System.out.println(str.indexOf("o"));  //  gives us the index number of first char o .
        System.out.println("-------------------------");

        //what about the second o ?
        System.out.println(str.lastIndexOf("o"));

        System.out.println("------------------");

    // most of the the its not used with char but lets see.
        System.out.println(str.indexOf('l'));       // use ''    //works only tek bir harf ile char.







    }
}
