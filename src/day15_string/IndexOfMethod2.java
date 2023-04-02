package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {

        String str = "lopoooooop";          //9 characters //8 index numbers
        //            0123456789

        System.out.println(str.indexOf("o"));  //it gives me 1 index of the first o.    //with index we're getting the location of the letter
        System.out.println(str.indexOf("o", 2)); //3      //I'm saying start from index of 2 then give me the first o index saga dogru    //2 index numberdan sonraki first o nun index number i

       // System.out.println(str.indexOf("o", str.indexOf("o")+1)); first index of o is = 1
        //                                                 1 + 1 = 2
        //                                 "o",  2











    }
}
