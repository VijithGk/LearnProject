package Collections;

import java.util.HashSet;

public class CarRegistryManager 
{
    private HashSet<String> hashSet = new HashSet<>();

    public HashSet<String> getHashSet() {
        return hashSet;
    }

    public void setHashSet(HashSet<String> hashSet) {
        this.hashSet = hashSet;
    }

    public boolean regCar(String plate)
    {
        if(CarUtil.validateNumberPlate(plate))
        {
            hashSet.add(plate);
            return true;
        }
        else
        {
            return false;
        }
        
    }

    public HashSet<String> viewAllRegisteredCars()
    {
        return hashSet;
    }

    public boolean updatePlate(String oldPlate, String newPlate)
    {
        if(!(CarUtil.validateNumberPlate(oldPlate) || CarUtil.validateNumberPlate(newPlate)))
        {
            System.out.println("Invalid Plate Format");
            return false;
        }
        if(!(hashSet.contains(oldPlate)))
        {
            System.out.println("\nEntered Old Plate does not exist on the System");
            return false;
        }
        if(hashSet.contains(newPlate))
        {
            System.out.println("Entered New Plate already exists in the system!");
            return false;
        }

        hashSet.remove(oldPlate);
        hashSet.add(newPlate);
        return true;
    }

    public boolean deleteCar(String plate)
    {
        if(hashSet.contains(plate))
        {
            hashSet.remove(plate);
            return true;
        }
        return false;
    }

    public String recentPlate()
    {
        if(hashSet.isEmpty())
        {
            return null;
        }
        String latestPlate = null;
        int maxNum = -1;

        for(String s : hashSet)
        {
            String plate[] = s.split("-");
            int number = Integer.parseInt(plate[3]);

            if(number>maxNum)
            {
                maxNum = number;
                latestPlate = s;
            }
        }
        return latestPlate;
    }

    public int getTotalCars()
    {
        return hashSet.size();
    }
}
