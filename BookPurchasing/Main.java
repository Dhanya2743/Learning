package BookPurchasing;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        StudentInterface s1=new Student();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Bookname:");
        String inputBookname=sc.nextLine();
        s1.setBookname(inputBookname);
        System.out.println("enter the supplierType:");
        String inputSuppliertype=sc.nextLine();
        s1.setSupplierType(inputSuppliertype);

        StudentInterface s2=new Student();
        System.out.println("enter the Bookname:");
        String inputBookname1=sc.nextLine();
        s2.setBookname(inputBookname1);
        System.out.println("enter the supplierType:");
        String inputSuppliertype1=sc.nextLine();
        s2.setSupplierType(inputSuppliertype1);


        if(s1.getSupplierType()=="librarian") {
            SupplierInterface lb = new Librarian(12, 150);
            lb.setStudent(s1);
            lb.borrowbook();
            SupplierInterface[] arr=s1.getSupplier();
            arr[0]=lb;
            System.out.println("idno");
            System.out.println(lb.getIdno());
            System.out.println("rental fee");
            System.out.println(lb.getRentalfee());
        }
       else{
            SupplierInterface bs =new BookSupplier(13,100);
            bs.setStudent(s1);
            bs.borrowbook();
            SupplierInterface[] arr=s1.getSupplier();
            arr[1]=bs;
            System.out.println("idno");
            System.out.println(bs.getIdno());
            System.out.println("rental fee");
            System.out.println(bs.getRentalfee());
       }
        if(s2.getSupplierType()=="BookSupplier") {
            SupplierInterface bs = new BookSupplier(14, 100);
            bs.setStudent(s2);
            bs.borrowbook();
            SupplierInterface[] arr=s2.getSupplier();
            arr[1]=bs;
            System.out.println("idno");
            System.out.println(bs.getIdno());
            System.out.println("rental fee");
            System.out.println(bs.getRentalfee());
        }
        else{
            SupplierInterface lb = new Librarian(12, 150);
            lb.setStudent(s2);
            lb.borrowbook();
            SupplierInterface[] arr=s2.getSupplier();
            arr[0]=lb;
            System.out.println("idno");
            System.out.println(lb.getIdno());
            System.out.println("rental fee");
            System.out.println(lb.getRentalfee());
        }




    }

}
