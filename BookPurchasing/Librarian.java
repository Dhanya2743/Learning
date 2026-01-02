package BookPurchasing;

public class Librarian extends Supplier implements LibrarianInterface{
    public Librarian(int idno,int rentalfee){
        this.setIdno(idno);
        this.setRentalfee(rentalfee);
    }
}
