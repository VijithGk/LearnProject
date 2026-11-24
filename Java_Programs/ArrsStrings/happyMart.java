package ArrsStrings;

public class happyMart 
{
    int productID;
    String productName;
    double price;

    public happyMart(int productID, String productName, double price) 
    {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "happyMart [productID=" + productID + ", productName=" + productName + ", price=" + price + "]";
    }

    
}
