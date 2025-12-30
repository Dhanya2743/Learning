package PizzaSystem;

public class Customer extends BaseFunctionalaties implements CustomerInterface{

    private String  pizzaType ;
    private int size;

    Customer(int orderId ,String pizzaType,int size){
        this.setOrderId(orderId);
        this.pizzaType=pizzaType;
        this.size= size;
    }
    Customer(){

    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPizzaType() {
        return pizzaType;
    }
}
