import java.util.ArrayList;
class Artist {
    private ArrayList<Album> albums;
    private String Name;

    public Artist(String Name) {
        this.Name=Name;
        albums=new ArrayList<>();
    }
    public void addAlbum(Album album) {
        albums.add(album);
    }
    public void deleteAlbum(Album album) {
        albums.remove(album);
    }
    public void showAlbums() {
        System.out.println("Albums: ");
        for (Album album:albums) {
            System.out.print(album.getName()+" ");
        }
    }
}