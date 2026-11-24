package OOPS;

public class Ticket 
{
    private int ticketId;
    private String passengerName;
    private String gender;
    String address;

    public Ticket(int ticketId, String passengerName, String gender, String address) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.gender = gender;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ticketId:" + ticketId + "/passengerName:" + passengerName + "/gender:" + gender + "/address:"
                + address;
    }

    
    
}
