import java.util.ArrayList;
class Album {
    private ArrayList<Song> songs;
    private String Name;

    public Album(String Name) {
        this.Name=Name;
        songs=new ArrayList<>();
    }
    public String getName() {
        return Name;
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void removeSong(Song song) {
        songs.remove(song);
    }
    public void showSongs() {
        System.out.println("Songs: ");
        for (Song song:songs) {
            song.playSong();
        }
    }

}