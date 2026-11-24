package Collections;

import java.util.InputMismatchException;

public class SongUtil 
{
    public static SongModel parseSong(String input) throws InputMismatchException
    {
        String arr[] = input.split(":");
        String songID = arr[0];
        String title = arr[1];
        String artist = arr[2];
        double duration = Double.parseDouble(arr[3]);

        try{
            if(validateID(songID))
            {
                return new SongModel(songID, title, artist, duration);
            }else
                return null;
        }catch(InputMismatchException e)
        {
            System.out.println("Error: "+e.getMessage());
            return null;
        }
        
    }

    public static boolean validateID(String songID)
    {
        if(songID==null)return false;
        
        String pattern = "^SONG\\d{2}\\d{4}";

        return songID.matches(pattern);
    }

}
