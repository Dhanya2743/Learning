package TicketBookingSystem;

public class SilverScreen extends Screen implements SilverScreenInterface {
    public SilverScreen(String bookingid,int ticketprice,int snackprice,int totalbill){
        this.setBookingid(bookingid);
        this.setTicketprice(ticketprice);
        this.setSnackprice(snackprice);
        this.setTotalbill(totalbill);
    }
}
