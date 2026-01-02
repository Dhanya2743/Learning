package BookPurchasing;

public interface StudentInterface {
    public String getSupplierType();
    public void setSupplierType(String supplierType);
    public String getBookname();
    public void setBookname(String bookname);
    public SupplierInterface[] getSupplier();
    public void setSupplier(SupplierInterface[] supplier);


}
