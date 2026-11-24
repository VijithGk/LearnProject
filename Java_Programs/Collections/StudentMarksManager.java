package Collections;

import java.util.ArrayList;

public class StudentMarksManager 
{
    private ArrayList<Double> list = new ArrayList<>();

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }


    public void addMarks(double mark)
    {
        if(StudentUtil.validateMarks(mark)==true)
        {
            list.add(mark);
            System.out.println("Marks was added successfully");
            //System.out.println(getList());
        }else{
            System.out.println("Marks should be between 0 to 100");
        }
    }

    public ArrayList<Double> viewAllMarks()
    {
        return list;
    }

    public int updateSpecificMark(double oldMark, double newMark) {
    int count = 0;

    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == oldMark) {
            list.set(i, newMark);
            count++;
        }
    }

    return count;
}

    public double getHighestMarks()
    {
        double highestMark = list.get(0);
        for(double s : list)
        {
            if(s>highestMark)
            {
                highestMark = s;
            }
        }
        return highestMark;
    }

    public double getAverageMarks()
    {
        double totalMarks = 0;
        int count = 0;
        for(double s : list)
        {
            totalMarks += s;
            count++;
        }
        return totalMarks/count;
    }

    public boolean deleteMarks(int index)
    {
        if(!getList().isEmpty())
        {
            if(!(list.get(index)==null))
            {
                list.remove(list.get(index));
                return true;
            }
        }
        // System.out.println("Invalid Index");
        return false;
        
    }
}
    
