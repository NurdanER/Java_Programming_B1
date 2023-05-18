package day35_inheritance.book;

public class AudioBook extends Book {

    double duration;
    String narrator;         //who is reading that book to you ?

    public void listen () {
        System.out.println("Listening the audio book " + title + " by " + author);
    }

//listen() ---------- signature method

}
