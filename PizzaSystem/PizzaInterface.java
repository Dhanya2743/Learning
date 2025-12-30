package PizzaSystem;

public interface PizzaInterface {
    public Customer getCustomer();
    public void setCustomer(Customer customer);
    public void orderPizza(int size);
}
