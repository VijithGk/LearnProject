package OOPS;

public class User 
{
    String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String userName) {
        super();
        this.userName = userName;
    }

    public void login()
    {
        System.out.println(userName+" has logged in");
    }

    public void logout()
    {
        System.out.println(userName+" has logged out");
    }
    
}
