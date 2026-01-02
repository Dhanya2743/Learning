package BookPurchasing;

public interface SupplierInterface  {
    public int getIdno();
    public void setIdno(int idno);
    public int getRentalfee();
    public void setRentalfee(int rentalfee);
    public StudentInterface getStudent();
    public void setStudent(StudentInterface student);
    public void borrowbook();

}
