package day33_a_static;

public class Song {


    //data, name, length, artist, genre


    String name;
    double length;
    String artist;
    String genre;

// Constuctors: name-length | name length- artist | name- length - artist | name- length-artist- genre

    public Song (String name, double length) {
        this.name = name;          //first one instance variable second one is local variable
        this.length = length;
    }


        public Song (String name, double length, String artist) {
        this(name, length);
        this.artist = artist;

        }


        public Song (String name, double length, String artist, String genre) {
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song: " +
                "name= " + name +
                "length: " + length +
                "artist: " + artist +
                "genre: " + genre ;
    }
}













