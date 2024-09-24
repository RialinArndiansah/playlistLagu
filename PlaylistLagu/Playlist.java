package PlaylistLagu;

public class Playlist {
    private Song head;

    // Konstruktor
    public Playlist() {
        this.head = null;
    }

    // Metode untuk menambahkan lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    // Metode untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("PlaylistLagu.Playlist kosong.");
            return;
        }
        Song current = head;
        System.out.println("Daftar Lagu di PlaylistLagu.Playlist:");
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }
}
