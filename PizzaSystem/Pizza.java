package PizzaSystem;

public  abstract class Pizza extends BaseFunctionalaties implements PizzaInterface{

    private Customer customer;
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public void orderPizza(int size){
        if(this.customer.getPizzaType()=="Regular"){
            int price = size*100;
            System.out.println("Pizza Ordered. Price");
            System.out.println(price);
        }
        else{
            int price =size*200;
            System.out.println("Pizza Ordered. Price");
            System.out.println(price);
        }
    }
}
