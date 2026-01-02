package BookPurchasing;

public abstract class Supplier implements SupplierInterface{
    private int idno;
    private int rentalfee;
    private StudentInterface student;

    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }

    public int getRentalfee() {
        return rentalfee;
    }

    public void setRentalfee(int rentalfee) {
        this.rentalfee = rentalfee;
    }
    public StudentInterface getStudent() {
        return student;
    }

    public void setStudent(StudentInterface student) {
        this.student = student;
    }
    public void borrowbook(){
        System.out.println("book borrowed");
    }
}
