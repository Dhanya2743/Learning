package TicketBookingSystem;

public abstract class Screen implements ScreenInterface{
    private String bookingid;
    private int ticketprice;
    private int snackprice;
    private int totalbill;
    private ViewerInterface viewer;

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public int getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(int ticketprice) {
        this.ticketprice = ticketprice;
    }

    public int getSnackprice() {
        return snackprice;
    }

    public void setSnackprice(int snackprice) {
        this.snackprice = snackprice;
    }

    public int getTotalbill() {
        return totalbill;
    }

    public void setTotalbill(int totalbill) {
        this.totalbill = totalbill;
    }
    //method 1
    public void calculateticketprice(){
        ticketprice=viewer.getNoofseats()*500;
        System.out.println("Ticket price:");
        System.out.println(ticketprice);
    }
    //method 2
    public void calculatesnackprice(){
        if(viewer.getWantsnacks()=="yes"){
            snackprice=viewer.getSnackquantity()*150;
        }
        else{
            snackprice=0;
        }
        System.out.println("snackprice:");
        System.out.println(snackprice);
    }
    //method 3
    public void generateBill(){
        totalbill=ticketprice=+ snackprice+100;
        System.out.println("Total Bill:");
        System.out.println(totalbill);
    }
    //method 4
    public void applydiscount(){
        int discount=0;
        if(viewer.getNoofseats()>=4){
            discount=totalbill*10/100;
            totalbill=totalbill-discount;
        }
        System.out.println("Discount applied:");
        System.out.println(discount);
        System.out.println("Final Bill:");
        System.out.println(totalbill);
    }

    public void setViewer(ViewerInterface viewer) {
        this.viewer = viewer;
    }
    public ViewerInterface getViewer() {
        return viewer;
    }

}
