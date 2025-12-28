package RestraurantSystem;

public abstract class Order extends BaseFunctionalities implements OrderInterface {
    public void placeorder(int person) {
        int bill = person * 250;
        System.out.println("order placed");
        System.out.println("bill:" + bill);
    }
    public void placeorder(int person, int items) {
        int bill = person * 250 * items ;
        System.out.println("order placed");
        System.out.println("bill:" + bill);
    }
    public void cancelorder(){
        double bill=this.getBill()-this.getBill();
        System.out.println("order Cancelled");
    }


}
