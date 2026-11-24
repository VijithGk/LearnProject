package OOPS;

public class existingCustomer 
{
    private String name;
    private String panNo;
    private String emailId;
    private int salary;
    
    public existingCustomer(String name, String panNo, String emailId, int salary) {
        this.name = name;
        this.panNo = panNo;
        this.emailId = emailId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(obj==null||obj.getClass()!=getClass())
        {
            return false;
        }
        existingCustomer c = (existingCustomer) obj;

        return this.emailId.equals(c.emailId)&&this.panNo.equals(c.panNo);


    }
}
