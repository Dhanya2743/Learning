package BookPurchasing;

public class BookSupplier extends Supplier implements BookSupplierInterface{
    public BookSupplier(int idno,int rentalfee){
            this.setIdno(idno);
            this.setRentalfee(rentalfee);
        }
        public BookSupplier(){
        }

}
