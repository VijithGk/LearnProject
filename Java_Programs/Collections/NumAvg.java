package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class NumAvg 
{
    TreeSet<Integer> numSet = new TreeSet<>();

    public TreeSet<Integer> getNumSet() {
        return numSet;
    }

    public void setNumSet(TreeSet<Integer> numSet) {
        this.numSet = numSet;
    }

    public void addNum(int num)
    {
        if(num%5 != 0 && num%6 != 0)
        {
            numSet.add(num);
        }
        else
            System.out.println("This number can be divided by 5 or 6");
    }

    public double calAvg()
    {
        int sum=0;
        Iterator<Integer> itr = getNumSet().iterator();
        while(itr.hasNext())
        {
            sum += itr.next();
        }
        double avg = sum/getNumSet().size();
        return avg;
    }
}

