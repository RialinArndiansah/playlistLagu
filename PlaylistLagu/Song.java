package PlaylistLagu;

public class Song {
    String title;
    Song next;

    // Konstruktor
    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}
