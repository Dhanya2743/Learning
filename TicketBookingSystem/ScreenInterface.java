package TicketBookingSystem;

public interface ScreenInterface {
    public String getBookingid();


    public void setBookingid(String bookingid);

    public int getTicketprice();

    public void setTicketprice(int ticketprice);

    public int getSnackprice();

    public void setSnackprice(int snackprice);

    public int getTotalbill();

    public void setTotalbill(int totalbill);

    public void calculateticketprice();

    public void calculatesnackprice();

    public void generateBill();

    public void applydiscount();

    public void setViewer(ViewerInterface viewer);
    public ViewerInterface getViewer();
}
