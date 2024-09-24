package PlaylistLagu;

public class Song {
    String title; // Judul lagu
    Song next;    // Referensi ke lagu berikutnya

    // Konstruktor
    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}
