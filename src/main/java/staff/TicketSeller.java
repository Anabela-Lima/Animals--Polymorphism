package staff;

public class TicketSeller extends Staff implements Seller{   // extend abstract class, implement an interface seller

    // constructor

    public TicketSeller(String name){
        super(name);
    }

    // implementing the sellticket method

    public String sellTicket(){
        return "Ticket sold!";
    }




    // implemnenting go home at end of day methiod

    @Override
    public void goHomeAtEndOfDay() {

    }




}

