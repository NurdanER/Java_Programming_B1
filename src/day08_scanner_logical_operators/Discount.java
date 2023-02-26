package day08_scanner_logical_operators;

public class Discount {

    /*            declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions

     */

    public static void main(String[] args) {

        boolean isItTheWeekend = true;
        boolean areYouATeacher = false;
        boolean areYouAPoliceOfficer = false;
        boolean areYouAFirefighter = false;
        boolean getDiscount = isItTheWeekend && (areYouATeacher || areYouAPoliceOfficer || areYouAFirefighter);
        //                                             false             false                  false
        //                                                        false          ||      false
        //                            true  &&     false
        // they are in !!!!!!! paranthesis !!!!!!! soooo first they are executeed and its false
        // eger parantez icinde herhangi birisi true olsaydi       is it weekend true ile parantezdenb cikan sonuc true esittir true oalcakti.

        System.out.printf("Do you get a discount?" + getDiscount );





    }
}
