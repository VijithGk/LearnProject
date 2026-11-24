package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SongUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        SongLibrary library = new SongLibrary();

        while(true)
        {
            System.out.println("----------SONG LIBRARY MENU----------");
            System.out.println("1. Add a Song");
            System.out.println("2. Deleate a Song by Song ID");
            System.out.println("3. Search a Song by keyword");
            System.out.println("4. Update a Song Duration by Title");
            System.out.println("5. Get total Song Count");
            System.out.println("6. View all Songs");
            System.out.println("9. Exit Application");
            int choice = Integer.parseInt(sc.next());
            try
            {
                switch(choice)
                {
                    case 1:
                        System.out.println("Enter number of songs to be added");
                        int num = Integer.parseInt(sc.next());
                        
                        for(int i=0;i<num;i++)
                        {
                            System.out.println("Enter Song Details: ");
                            String input = sc.next();

                            SongModel songs = SongUtil.parseSong(input);
                            if(!(songs==null))
                            {
                                library.add(songs);
                                System.out.println("Added: " + songs.getSongID());
                            }
                            else{
                                System.out.println("Song ID is Invalid");
                            }
                            
                        }
                        System.out.println("Songs were added successfully!");
                        break;
                    
                    case 2:
                        System.out.println("Enter the SONGID to be deleted");
                        String id = sc.next();

                        boolean deleted = library.deleteSong(id);
                        if(deleted)
                        {
                            System.out.println("Song deleted");
                        }
                        else
                            System.out.println("Song ID not found");
                        break;

                    case 3:
                        System.out.println("Search by keyword...");
                        String keyInput = sc.next();

                        ArrayList<SongModel> result = library.searchSongs(keyInput);
                        if(result.isEmpty())
                        {
                            System.out.println("Song was not found in the library!");
                        }
                        else
                        {
                            for(SongModel s : result)
                            {
                                System.out.println(s);
                            }
                        }break;
                    
                    case 4:
                        System.out.println("Enter the title of the song to update the duration");
                        String title = sc.next();
                        System.out.println("Enter the Updated Duration: ");
                        double duration = Double.parseDouble(sc.next());
                        if(!(title.equals(null)) && duration>0)
                        {
                            SongModel updatedDuration = library.updateSongDuration(title, duration);
                            if(!(updatedDuration==null))
                            {
                                System.out.println(library.list);
                            }else{
                                System.out.println("Title entered was not found in the Library");
                            }
                            
                        }
                        else{
                            System.out.println("Invalid Input, please try again!");
                        }break;
                    
                    case 5:
                        System.out.println("The total songs stored in our Library is: "+library.getSongCount());
                        break;

                    case 6:
                        System.out.println(library.viewAllSongs());
                        break;

                    case 9:
                        sc.close();
                    default:
                        System.out.println("Thanks for using the application!");
                        break;
                }
            }catch(NumberFormatException e)
            {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}
