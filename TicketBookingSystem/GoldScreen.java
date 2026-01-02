package TicketBookingSystem;

public class GoldScreen extends Screen implements ScreenInterface{
    public GoldScreen(String bookingid,int ticketprice,int snackprice,int totalbill){
        this.setBookingid(bookingid);
        this.setTicketprice(ticketprice);
        this.setSnackprice(snackprice);
        this.setTotalbill(totalbill);
    }
}
