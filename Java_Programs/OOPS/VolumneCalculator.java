package OOPS;

public class VolumneCalculator 
{
    public double calculateVolume(double radius, double height)
    {
        return (Math.PI)*(radius*radius)*height;
    }

    public double calculateVolume(int length, int bredth, int height)
    {
        return length*bredth*height;
    }
    
}
