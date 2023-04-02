package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] groups = new String[3][];
//        String [][] groups = new String[3][2];          //here[3] ---> I'm gonna have 3 single array , [2] each array will have 2 elements!!!!!!!!!!!!!!!
//        System.out.println(Arrays.deepToString(groups));             //is null because                                      //2d dimentonal array

        String [] groupOneNames = {"Ilgar", "Nazarii", "Naima", "Nurda", "Gunay"};
        groups [0] = groupOneNames;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 2");
        String [] groupTwoNames = {"Ilgar", "Ruslan", "Melek", "Taleh", "Nataliia" };
        groups[1] = groupTwoNames;
        System.out.println(Arrays.deepToString(groups));


        System.out.println("Adding group 3");
        String [] groupThreeNames = {"Shefeg", "Safail", "Aysel", "Yuliia", "Vasile"};
        groups[2] = groupThreeNames;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("-------------------");
        for ( String [] eachArr : groups) {
            for (String eachElement : eachArr) {
                System.out.println(eachElement);
            }
            System.out.println("------------");
        }












    }
}
