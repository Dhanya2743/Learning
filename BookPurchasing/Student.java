package BookPurchasing;

public class Student implements StudentInterface  {
    private String SupplierType;
    private String Bookname;
    private SupplierInterface[] supplier=new SupplierInterface[2];

    public Student(){

    }
    public String getSupplierType()
     {
        return SupplierType;
    }

    public void setSupplierType(String supplierType) {
        SupplierType = supplierType;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }


    public SupplierInterface[] getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierInterface[] supplier) {
        this.supplier = supplier;
    }
}

