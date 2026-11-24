package Collections;

import java.util.ArrayList;

public class SongLibrary 
{
    ArrayList<SongModel> list = new ArrayList<>();

    public void add(SongModel song)
    {
        list.add(song);
    }
    
    public boolean deleteSong(String songID)
    {
        System.out.println("Entered ID: " + songID);

        for(SongModel s : list)
        {
            System.out.println("Stored ID: " + s.getSongID());

            if(songID.trim().equalsIgnoreCase(s.getSongID().trim()))
            {
                list.remove(s);
                return true;
            }
        }
        return false;
}

    public ArrayList<SongModel> searchSongs(String keyword)
    {
        ArrayList <SongModel> resultList = new ArrayList<>();
        String key = keyword.toLowerCase();

        for(SongModel s : list)
        {
            if(s.getTitle().toLowerCase().contains(key))
            {
                resultList.add(s);
            }
        }
        return resultList;
    }

    public SongModel updateSongDuration(String title, double newDuration)
    {
       for(SongModel s : list)
        {
            if(s.getTitle().equalsIgnoreCase(title))
            {
                s.setDuration(newDuration);
                return s;
            }
        }
        return  null; 
    }

    public int getSongCount()
    {
        return list.size();
    }

    public ArrayList<SongModel> viewAllSongs()
    {
        return list;
    }


}
