public class FreeUser implements User {
    private int ListenLimit;
    public FreeUser(){
        ListenLimit=0;
    }

    public void listen(Song song) {
        if (ListenLimit < 10) {
            song.playSong();
            ListenLimit++;
        } else {
            System.out.println("Listen limit reached for your Free account please subscribe for our premium program to listen more.");
        }
    }
    public void addToPlaylist(Playlist playlist,Song song) {
        if (playlist.getSongs().size()< 5) {
            playlist.addSong(song);
        } else {
            System.out.println("Cannot add more than 5 songs to playlist for FreeUser.");
        }
    }
}
