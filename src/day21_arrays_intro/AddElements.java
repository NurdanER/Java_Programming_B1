package day21_arrays_intro;

public class AddElements {
    public static void main(String[] args) {

        int [] nums = {3, 6, 10};                            //nums.length---> number of elements --> 3
        System.out.println("Total: " +nums[0] + nums[1]+ nums[2] );

        System.out.println("---------------------------------");

        int total = 0;
        for (int i = 0; i < nums.length; i++) {   //nums.length = 3            //i=0
            total+= nums[i];
        }

        System.out.println("Total: " + total);

















    }
}
