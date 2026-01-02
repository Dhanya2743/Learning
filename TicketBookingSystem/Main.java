package TicketBookingSystem;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

        ViewerInterface v1 = new Viewer();
        Scanner sc = new Scanner(System.in);
        System.out.println("===== VIEWER 1 =====");
        System.out.print("Enter number of seats: ");
        int inputNoofseat = sc.nextInt();
        v1.setNoofseats(inputNoofseat);
        System.out.println("Enter screen type:");
        String inputscreentype = sc.nextLine();
        v1.setScreentype(inputscreentype);
        System.out.println("Want snacks:");
        String inputwantsnack = sc.nextLine();
        v1.setWantsnacks(inputwantsnack);

        ViewerInterface v2 = new Viewer();
        System.out.println("===== VIEWER 2 =====");
        System.out.println("Enter number of seats: ");
        int inputNoofseat1 = sc.nextInt();
        v2.setNoofseats(inputNoofseat1);
        System.out.println("Enter screen type: ");
        String inputscreentype1 = sc.nextLine();
        v2.setScreentype(inputscreentype1);
        System.out.println("Want snacks: ");
        String inputwantsnack1 = sc.nextLine();
        v2.setWantsnacks(inputwantsnack1);

        if (v1.getScreentype() == "GoldScreen") {
            ScreenInterface gs = new GoldScreen("s01", 500, 150, 650);
            gs.setViewer(v1);
            gs.calculateticketprice();
            gs.calculatesnackprice();
            gs.generateBill();
            gs.applydiscount();
            ScreenInterface[] arr = v1.getSn();
            arr[0] = gs;
            System.out.println("bookingid");
            System.out.println(arr[0].getBookingid());
            System.out.println("ticketprice");
            System.out.println(arr[0].getTicketprice());
            System.out.println("snackprice");
            System.out.println(arr[0].getSnackprice());
            System.out.println("totalbill");
            System.out.println(arr[0].getTotalbill());
        } else {
            ScreenInterface ss = new SilverScreen("s02", 300, 100, 400);
            ss.setViewer(v1);
            ss.calculateticketprice();
            ss.calculatesnackprice();
            ss.generateBill();
            ss.applydiscount();
            ScreenInterface[] arr = v1.getSn();
            arr[1] = ss;
            System.out.println("bookingid");
            System.out.println(arr[1].getBookingid());
            System.out.println("ticketprice");
            System.out.println(arr[1].getTicketprice());
            System.out.println("snackprice");
            System.out.println(arr[1].getSnackprice());
            System.out.println("totalbill");
            System.out.println(arr[1].getTotalbill());
        }
        if (v2.getScreentype() == "SilverScreen") {
            ScreenInterface ss = new SilverScreen("s02", 300, 100, 400);
            ss.setViewer(v2);
            ss.calculateticketprice();
            ss.calculatesnackprice();
            ss.generateBill();
            ss.applydiscount();
            ScreenInterface[] arr = v2.getSn();
            arr[0] = ss;
            System.out.println("bookingid");
            System.out.println(arr[0].getBookingid());
            System.out.println("ticketprice");
            System.out.println(arr[0].getTicketprice());
            System.out.println("snackprice");
            System.out.println(arr[0].getSnackprice());
            System.out.println("totalbill");
            System.out.println(arr[0].getTotalbill());
        } else {
            ScreenInterface gs = new GoldScreen("s01", 500, 150, 650);
            gs.setViewer(v2);
            gs.calculateticketprice();
            gs.calculatesnackprice();
            gs.generateBill();
            gs.applydiscount();
            ScreenInterface[] arr = v2.getSn();
            arr[1] = gs;
            System.out.println("bookingid");
            System.out.println(arr[1].getBookingid());
            System.out.println("ticketprice");
            System.out.println(arr[1].getTicketprice());
            System.out.println("snackprice");
            System.out.println(arr[1].getSnackprice());
            System.out.println("totalbill");
            System.out.println(arr[1].getTotalbill());
        }
    }
}



