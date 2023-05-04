package my_util;

public class ArrayUtil {
    public static void main(String[] args) {

    }
    public static int smallestInArr(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {

        }

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static int biggestInArr(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {

        }

        int biggest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }

        return biggest;
    }

    public static boolean containsInArr(int[] arr, int number) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {

        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }

        return false;
    }

    public static int[] addToArr(int[] arr, int number) {

        int[] newArr = new int[arr.length + 1];


        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }


        newArr[newArr.length - 1] = number;

        return newArr;
    }


}
