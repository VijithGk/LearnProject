

public class WoodenBero extends Bero
{
    private String woodtype;

    public WoodenBero(String beroType, String beroColour, String woodtype) {
        super(beroType, beroColour);
        this.woodtype = woodtype;
    }

    public String getWoodtype() {
        return woodtype;
    }

    public void setWoodtype(String woodtype) {
        this.woodtype = woodtype;
    }

    public void calculatePrice()
    {
       // double price = 0;
        if(woodtype.equalsIgnoreCase("Ply Wood"))
        {
            price = 15000;
        }
        else if(woodtype.equalsIgnoreCase("Teak Wood"))
        {
            price = 12000;
        }
        else if(woodtype.equalsIgnoreCase("Engineered Wood"))
        {
            price = 10000;
        }
    }
    
}
