public class Main {
    public static void main(String[] args) {
        Song song1=new Song("Song 1", "Artist 1", "Genre 1", 100);
        Song song2=new Song("Song 2", "Artist 2", "Genre 2", 200);
        Song song3=new Song("Song 3", "Artist 3", "Genre 3", 300);
        Album album1=new Album("Album 1");
        album1.addSong(song1);
        album1.addSong(song2);
        Album album2=new Album("Album 2");
        album2.addSong(song3);
        Artist artist1=new Artist("Artist 1");
        artist1.addAlbum(album1);
        artist1.addAlbum(album2);
        Playlist playlist=new Playlist(new FreeUser());
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        System.out.println("Playlist before shuffling:");
        for (Song song:playlist.getSongs()) {
            song.playSong();
            System.out.println("----");
        }
        playlist.shufflePlaylist();
        System.out.println("Playlist after shuffling:");
        for (Song song:playlist.getSongs()) {
            song.playSong();
            System.out.println("----");
        }

        FreeUser freeUser=new FreeUser();
        freeUser.listen(song1);
        freeUser.listen(song2);
        freeUser.listen(song3);
        freeUser.addToPlaylist(playlist, song1);
        freeUser.addToPlaylist(playlist, song2);
        freeUser.addToPlaylist(playlist, song3); //playlist already has 5 songs
        freeUser.addToPlaylist(playlist, new Song("Song 4","Artist 4","Genre 4",400));

        System.out.println("Free User Playlist:");
        for (Song song:playlist.getSongs()) {
            song.playSong();
            System.out.println("----");
        }
    }
}
