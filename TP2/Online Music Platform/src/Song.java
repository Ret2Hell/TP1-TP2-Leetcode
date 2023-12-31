class Song {
    private String title,artist,genre;
    private int length;

    public Song(String title,String artist,String genre,int length) {
        this.title=title;
        this.artist=artist;
        this.length=length;
        this.genre=genre;
    }

    public void playSong() {
        System.out.println("Title: "+title+"\nArtist: "+artist+"\nGenre: "+genre+"\nLength: "+length+" seconds");
    }
        public int getSongLength() {
        return length;
    }

}