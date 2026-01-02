package TicketBookingSystem;

public class Viewer implements ViewerInterface{
    private int noofseats;
    private String screentype;
    private String wantsnacks;
    private int snackquantity;
    private ScreenInterface[] sn=new Screen[2];

    public Viewer(){

    }

    public int getNoofseats() {
        return noofseats;
    }

    public void setNoofseats(int noofseats) {
        this.noofseats = noofseats;
    }

    public String getScreentype() {
        return screentype;
    }

    public void setScreentype(String screentype) {
        this.screentype = screentype;
    }

    public String getWantsnacks() {
        return wantsnacks;
    }

    public void setWantsnacks(String wantsnacks) {
        this.wantsnacks = wantsnacks;
    }

    public int getSnackquantity() {
        return snackquantity;
    }

    public void setSnackquantity(int snackquantity) {
        this.snackquantity = snackquantity;
    }


    public ScreenInterface[] getSn() {
        return sn;
    }

    public void setSn(ScreenInterface[] sn) {
        this.sn = sn;
    }
}
