package day21_arrays_intro;
/*
I'm gonna check the item I'm looking for when its avalable I'l stop
 */

public class Store {
    public static void main(String[] args) {

        //For Hat;

        String[] items = {"Shoes", "Jacket", "Gloves", "Hat", "Dress", "Sunglasses"};
        boolean hasHat = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("hat")) {                 //I'm gonna get each of them  //how can I compare each of them without case sensetiveness
                hasHat = true;
                break;                              //because I'm going to stop loop when the item is available.
            }

        }

        if (hasHat) {
            System.out.println("Hat item is available.");
        } else {
            System.out.println("hat is out of stock");
        }

        //This is extra recap Ternary
        System.out.println(hasHat ? "Hat item is available." :"hat is out of stock");


















    }
}
