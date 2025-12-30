package PizzaSystem;

public class PremiumPizza extends Pizza {
    public PremiumPizza(Customer customer) {
        this.setCustomer ( customer);
        this.setOrderId (customer.getOrderId());
    }
}

