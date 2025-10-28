package exercise1;

public class Song {

    //Declare Vars
    private String titel;
    private int duration;
    private String artist;

    //Create Constructor
    public Song(String titel, int duration, String artist) {
        this.titel = titel;
        this.duration = duration;
        this.artist = artist;
    }

    public String songTime() {
      //Change seconds into X Minuten x Sekunden
        int minutes = duration/60;
        int seconds = duration%60;
      return  " Minuten " + minutes +  " Second " +seconds;
    }

    @Override
    public String toString() {
        //Change toString Method output
        return "The song " + titel + " from" + artist + " is " +  songTime() + " seconds long.";
    }
}
