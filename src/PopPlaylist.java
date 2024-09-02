import java.util.ArrayList;

public class PopPlaylist extends Playlist{

    private static ArrayList<String> songs;
    private String title;
    private String artist;
    private double length;
    public PopPlaylist(String Name, String title, String artist, double length) {
        super(Name);
        this.songs = new ArrayList<String>();
        this.title = title;
        this.artist = artist;
        this.length = length;
    }






    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }
}
