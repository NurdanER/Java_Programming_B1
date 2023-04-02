package day20_nested_loops;

//Recording this part yazmayi unutma
//we need to find single ones
//output B

public class UniqueCharacters {
    public static void main(String[] args) {

            // char innerLetter = str.charAt(0);                  //its gonna happen 10 times
            // System.out.println(innerLetter);


    String str = "AAABCC";  // I HAVE 6 characters
        //        012345


        for (int i = 0; i < str.length(); i++) {            // A
                                                            // A
            char outerLetter = str.charAt(i) ;              // A
                                                            // B
                                                            // C
                                                            // C

            int count = 0;
                                                                      //      "AAABCC    - //      "AAABCC       //      "AAABCC         //      "AAABCC         //"AAABCC
            for (int j = 0; j < str.length(); j++) {                  // A  == A  //TRUE          // A  == A           // A  == A                    // B  == A        // C == A
                                                                      // A  == A  //TRUE          // A  == A           // A  == A                    // B  == A        // C == A
                char innerLetter = str.charAt(j);                     // A  == A                  // A  == A           // A  == A                    // B  == A        // C == A
                                                                      // A  == B                  // A  == B           // A  == B                    // B  == B        // C == B
                if (outerLetter == innerLetter) {                     // A  == C                  // A  == C           // A  == C                    // B  == C        // C == C
                    count++;                                          // A  == C                     A  == C           // A  == C                    // B  == C        // C == C     //TRUE
                }

            }  // Inner loop ends


            if (count == 1) {                            // //condition is one
                System.out.println(outerLetter);
            }


        }













    }
}
