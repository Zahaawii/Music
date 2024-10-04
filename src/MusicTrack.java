/*
2. MusicTrack Class:
Develop a class named MusicTrack that represents a music track.
The class should contain the following private attributes:

 */

public class MusicTrack {
    private String title;
    private String artist;
    private int rank;
    private Genre genre;

    public MusicTrack(String title, String artist, int rank, Genre genre){
        this.title = title;
        this.artist = artist;
        this.rank = rank;
        this.genre = genre;
    }

    // Method returns a String with track info
    public String toString() {
        return "Title: " + title + "\nArtist: " + artist + "\nRank: " + rank + "\nGenre: " + genre;
    }

    //Create a print line to display a nice overlay
    public static void printSeperator(int n) {
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

}
