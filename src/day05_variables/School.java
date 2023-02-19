package day05_variables;

public class School {

      /*
    Task:
        class name: School
        declare and assign these variables
            number of students in grade 1
            number of students in grade 2
            number of students in grade 3
            number of students in grade 4
            number of students in grade 5
            - > total number of students in your school
            number of days in a year (have some half day = ~ 100.5)
            number of snow days in a year (double)
            average gpa in school (3.5) [ranges 1.0 - 4.0]
            print all of the variables with unique messages
*/

    public static void main(String[] args) {
        int numberOfStudentsInGrade1 = 40;
        int numberOfStudentsInGrade2 = 30;
        int numberOfStudentsInGrade3 = 35;
        int numberOfStudentsInGrade4 = 50;
        int numberOfStudentsInGrade5 = 44;

        int totalNumberOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 +numberOfStudentsInGrade3 +numberOfStudentsInGrade4 +numberOfStudentsInGrade5;

        double numberOfDaysInYear= 100.5;
        double avernumberOfSnowDays = 5.5;
        double avarageGpaInSchool = 3.2;

        System.out.println("Number of students in Grade 1= " + numberOfStudentsInGrade1);
        System.out.println("Number of students in Grade 1= " + numberOfStudentsInGrade2);
        System.out.println("Number of students in Grade 1= " + numberOfStudentsInGrade3);
        System.out.println("Number of students in Grade 1= " + numberOfStudentsInGrade4);
        System.out.println("Number of students in Grade 1= " + numberOfStudentsInGrade5);
        System.out.println();

        System.out.println("Total number of Students: " + totalNumberOfStudents);

        System.out.println();
        System.out.println("Numbers of Days in year: " + numberOfDaysInYear);
        System.out.println("Numbers of snow days: " + avernumberOfSnowDays);
        System.out.println("Avarage Gpa in School: " +  avarageGpaInSchool);





        //shortcut; control d


    }


}
