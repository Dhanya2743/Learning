package RestraurantSystem;
/*
 ==>this is Restraurant Banking System
 ==>I have 3 entities,they are DineIn,TakeAway,Customer.
 ==>next,I declare variables for each Entity and I give getter and setter methods .
 ==>and then I create objects in main and set the values of each Variable as two customers named as c1,c2.
 ==>and create methods in entities -cancel order,packaging added,reserved table.
 ==>And then I used to create abstract class,then interface for redundancy and security
 ==>overloading and overriding happens


 */

public class Main {

    public static void main(String args[]) {

        CustomerInterface c1 = new Customer();
        CustomerInterface c2 = new Customer();

        DineInInterface dine=new DineIn();
        TakeAwayInterface take=new TakeAway();

        c1.setOrdertype("DineIn");
        c1.setPersons(2);
        c1.setItems(5);
        dine.placeorder(c1.getPersons());
        dine.placeorder(c1.getItems(),c1.getPersons());
        dine.reservedtable("Table Reserved");

        c2.setOrdertype("Takeaway");
        c2.setPersons(2);
        take.placeorder(c2.getPersons());
        take.addpackaging("Packaging added");







    }

}