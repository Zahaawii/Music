public class UI {

    public static void UserInterface() {
        Genre genre = Genre.POP;
        MusicTrack myTrack = new MusicTrack("Blyat","Putin",1,genre);
        MusicTrack myTrackTwo = new MusicTrack("F the pop", "NWA", 1, Genre.R_AND_B);

        MusicTrack.printSeperator(30);
        System.out.println(myTrack.toString() + " " + genre.getDesc() );
        MusicTrack.printSeperator(30);
        System.out.println(myTrackTwo.toString() + " " + Genre.R_AND_B + "\nDescription: " + Genre.R_AND_B.getDesc());
        MusicTrack.printSeperator(30);

    }
}
