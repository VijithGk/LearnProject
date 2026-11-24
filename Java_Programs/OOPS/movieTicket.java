package OOPS;

public class movieTicket 
{
    private int ticketID;
    private int price;
    static int availableTickets;

    public int getTicketID() {
        return ticketID;
    }
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static int getAvailableTickets() {
        return availableTickets;
    }
    public static void setAvailableTickets(int availableTickets) {
        movieTicket.availableTickets = availableTickets;
    }
    
    public int calculateTicketCost(int nooftickets)
    {
        if(availableTickets>0 && availableTickets>=nooftickets)
        {
            int totalAmount = nooftickets*price;
            availableTickets -= nooftickets;
            return totalAmount;
        }
        else{
            return -1;
        }        
        
    }
}
