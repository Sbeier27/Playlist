import java.util.ArrayList;
import java.util.List;
public class Playlist {


    private String Name;

    private static ArrayList<String> songs;
    private String title;
    private double length;
    private String artist;

    public static void addSong(String song){
        songs.add(song);

    }

    public static void removeSong(String song){
        songs.remove(song);
    }

    public static void playAllSongs(){
        System.out.println(songs);
    }

    public Playlist (String Name){
        this.Name = Name;
        this.songs = new ArrayList<String>();
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }




}
