package day15_string;

public class SubstringMethod {
    public static void main(String[] args) {

String str = "Saturday";       //8 characters          //LastIndex is 7
//            01234567
//

        System.out.println(str.substring(3));    //it starts from the index  number of CHAR THE FIRST NUMBER IN PARANTHESIS  till the end of the String.
        System.out.println(str.substring(6));

        //if I want tur
        System.out.println(str.substring(2, 5));       //HERE IT STARTS FROM THE INDEX NUMBER OF CHAR THE FIRST NUMBER IN PARANTHESIS GOES TO ONE BEFORE THE SECOND INDEX NUMBER OF CHAR IN THE PARANTHESIS
        //                               tur //stops at 4 because 5 is d
        System.out.println(str.substring(0, 5));
        //                               Satur

        System.out.println(str.substring(0, 5) + "day");
        //                               Satur     day = Saturday
        System.out.println(str.substring(0, 5) +str.substring(5, 8));    //code doesnt give me error because it says stops at before 8
        //                               Satur                day  =Saturday
        System.out.println(str.substring(0,5) + str.substring(5));
        //                               Satur                          day  = Saturday













    }
}
