package day10_a_if_statements;
/*
        Declare and assign a number (day)

            1 - Monday
            2 - Tuesday
            ..
            6 - Saturday
            7 - Sunday

            Ex: 2
                Tuesday
 */

public class DaysOfWeek {
    public static void main(String[] args) {
        int day = 4;

        int dayNumber=4;
        if(dayNumber==1){
            System.out.println("Monday");            //true
        }else if(dayNumber==2){                       //false
            System.out.println("Tuesday");
        }else if(dayNumber==3){                      //false
            System.out.println("Wednesday");
        }else if(dayNumber==4){                      //false
            System.out.println("Thursday");
        }else if(dayNumber==5){                           //true burada duruyor ve burayi cikariyor cunku true.  yukariyi ve asagiyi skip yapiyor cunku onlar false.
            System.out.println("Friday");
        }else if(dayNumber==6){
            System.out.println("Saturday" );
        }else if(dayNumber==7){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid number of day");
        }










    }
}
