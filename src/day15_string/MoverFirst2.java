package day15_string;

public class MoverFirst2 {
    public static void main(String[] args) {

        String str = "One Two";
        String firstPart = str.substring(0, str.indexOf(" "));     //here starts from 0 and end before space !!
        String secondPart = str.substring(str.indexOf(" ")+1);


        System.out.println(secondPart + " " + firstPart);          //we switched the places





    }
}
