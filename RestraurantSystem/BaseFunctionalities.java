package RestraurantSystem;

public abstract class  BaseFunctionalities implements BaseFunctionalitiesInterface {
    private int orderid;
    private double bill;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public double getBill() {
        return bill;
    }
    public void setBill(int bill) {
        this.bill = bill;
    }

}
