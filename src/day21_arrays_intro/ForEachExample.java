package day21_arrays_intro;

public class ForEachExample {
    public static void main(String[] args) {

      int [] nums = {30, 12, 159, 12};
      //              0   1   2     3
        for (int i = 0; i < nums.length; i++) {
            System.out.println("With Traditional for loop: " + nums[i]);
        }

        System.out.println("--------------------------------------");

        for (int each:       nums ) {                                          //has to match int and nums they both have int data type
            System.out.println("With ForEachloop: " +each);

        }


        //how we decide which one we use?
        //If someone comes and ask us can you go through index 2 to another number so we cannot do that with foreachloop


        System.out.println("------------------------");

        String[] words = {"java", "soft skills", "selenium", "Sql", "api"};

        for (int i = 0; i < words.length; i++) {
            System.out.println("With Traditional for loop: " +words[i]);

        }

        for (String eachWord:  words) {                     //both has String data type
            System.out.println("With foreach loop " + eachWord);
        }

        System.out.println("------------------------");


        for (String eachWord:  words) {                     //both has String data type
            System.out.println("With foreach loop " + eachWord);

            if (eachWord.equalsIgnoreCase("selenium")) {
                System.out.println("With foreach loop: " + eachWord.substring(2, 4));
            }
        }








    }
}
