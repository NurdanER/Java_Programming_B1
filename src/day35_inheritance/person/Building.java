package day35_inheritance.person;

public class Building {
    //object class is the very first person class in java comes from java lang.
    public static void main(String[] args) {
        Person person = new Person();   //THIS IS A CONSTRUCTOR
        person.name = "James Bond";
        person.age = 40;
        person.talk();
     //   person.study(); //since this belongs specifically to the child parent class object can Not access
     //    person.funLevel = 30;


        Student student = new Student();
        student.name = "Tom Jerry";
        student.age = 30;
        student.favoriteHobby = "chit cheat";
        student.talk();
        student.funLevel = 100;
        student.study();














    }
}
