package PlaylistLagu;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(); // Membuat playlist baru
        playlist.addSong("Diam Keroncong-payung teduh"); // Menambahkan lagu
        playlist.addSong("bidadari surga");
        playlist.addSong("young lex");

        playlist.displayPlaylist(); // Menampilkan semua lagu
    }
}
