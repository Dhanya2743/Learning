package TicketBookingSystem;

public interface ViewerInterface {
    public int getNoofseats();
    public void setNoofseats(int noofseats) ;
    public String getScreentype();
    public void setScreentype(String screentype);
    public String getWantsnacks();
    public void setWantsnacks(String wantsnacks);
    public int getSnackquantity();
    public void setSnackquantity(int snackquantity);
    public ScreenInterface[] getSn();
    public void setSn(ScreenInterface[] sn);
    }

