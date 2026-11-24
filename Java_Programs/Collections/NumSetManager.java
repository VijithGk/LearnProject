package Collections;

import java.util.TreeSet;

public class NumSetManager 
{
    private TreeSet<Integer> set = new TreeSet<>();

    public TreeSet<Integer> getSet() {
        return set;
    }

    public void setSet(TreeSet<Integer> set) {
        this.set = set;
    }

    public void addNumber(int num)
    {
        if((num%5==0 || num%6==0))
        {
            System.out.println("\nNumber should not be divisible by eiher 5 or 6");
        }else
        {
            set.add(num);
            System.out.println("Number was added successfully");
        }
    }

    public TreeSet<Integer> viewAllNumbers()
    {
        return set;
    }

    public boolean updateNumber(int oldNum, int newNum)
    {
        for(Integer s : set)
        {
            if(s.equals(oldNum))
            {
                if(newNum%5==0 || newNum%6==0)
                {
                    System.out.println("New Number is Invalid!");
                    
                }
                else
                {
                    set.remove(oldNum);
                    set.add(newNum);
                    return true;
                    //return false;
                }
            }
        }return false;
    }

    public boolean deleteNumber(int num)
    {
        return set.remove(num);
    }

    public TreeSet<Integer> viewGreaterNum(int value)
    {
        TreeSet<Integer> greaterValues = new TreeSet<>();
        for(Integer s : set)
        {
            
            if(s>value)
            {
                greaterValues.add(s);
            }
            
        }
        return greaterValues;
    }

    public double calculateAverage()
    {
        double totalSum = 0;
        for(Integer s : set)
        {
            totalSum += s;
        }
        return totalSum/set.size();
    }
    
}