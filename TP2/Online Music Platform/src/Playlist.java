import java.util.ArrayList;
import java.util.Collections;
public class Playlist {
    private ArrayList<Song> songs;
    private User user;

    public Playlist(User user) {
        this.user=user;
        songs=new ArrayList<>();
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void removeSong(Song song) {
        songs.remove(song);
    }
    public void shufflePlaylist() {
        Collections.shuffle(songs);
    }
}
