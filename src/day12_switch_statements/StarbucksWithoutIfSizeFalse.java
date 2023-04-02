package day12_switch_statements;

import java.util.Scanner;

public class StarbucksWithoutIfSizeFalse {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            double price =0.0;           //we have to give value that variables becuase on default part it is complaning
            int calories =0;

            System.out.println("Which size drink they want");
            String size = input.next();

            switch (size) {
                case "tall":
                    price = 2.50;
                    calories = 100;
                    break;
                case "grande":
                    price = 4.00;
                    calories = 150;
                    break;
                case "venti":
                    price = 4.50;
                    calories = 200;
                    break;
                default:
                    System.out.println("We don't have that size");
            }


             System.out.println("Your order for " + size + "coffee price is " + price + " and calories " + calories);




        }
    }

