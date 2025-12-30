package PizzaSystem;

public class RegularPizza extends Pizza{

    public RegularPizza(Customer customer) {
        this.setCustomer(customer);
        this.setOrderId( customer.getOrderId());
    }
}
