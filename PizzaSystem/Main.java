package PizzaSystem;

public class Main {
    public  static void main(String agrs[]){
        Customer customer = new Customer(2456,"RegularPizza",2);

        RegularPizza regular =new RegularPizza(customer);
        regular.orderPizza(customer.getSize());

        Customer customer1 = new Customer();
        customer1.setOrderId(2456);
        customer1.setPizzaType("PremiumPizza");
        customer1.setSize(4);

        PremiumPizza premium = new PremiumPizza(customer);
        premium.orderPizza(customer1.getSize());

    }
}
