package PizzaSystem;

public abstract class BaseFunctionalaties implements BaseFunctionalatiesInterface {

    private  int orderId;
    private int price ;
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
