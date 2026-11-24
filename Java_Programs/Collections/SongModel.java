package Collections;

public class SongModel 
{
    private String songID;
    private String title;
    private String artist;
    private double duration;

    public SongModel(String songID, String title, String artist, double duration) {
        this.songID = songID;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "SongModel [songID=" + songID + ", title=" + title + ", artist=" + artist + ", duration=" + duration
                + "]";
    }


    
    
}
