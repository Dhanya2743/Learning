package RestraurantSystem;

public class TakeAway extends Order implements TakeAwayInterface{
   public void addpackaging(String pakage) {
        System.out.println("Pakaging added");
   }
   @Override
   public void cancelorder(){
       double bill=this.getBill();
       System.out.println("your order will not be Cancelled");
   }

}
