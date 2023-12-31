public class PremiumUser implements User {
    public void listen(Song song) {
        song.playSong();
    }
    public void addToPlaylist(Playlist playlist,Song song) {
        playlist.addSong(song);
    }

}
