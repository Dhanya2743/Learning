package TicketBookingSystem;
import BookPurchasing.SupplierInterface;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.logging.Level;

public class Main {

    public static void main(String args[]) {

        ViewerInterface v1 = new Viewer();
        Scanner sc = new Scanner(System.in);
        System.out.println("===== VIEWER 1 =====");
        System.out.print("Enter number of seats: ");
        BigInteger inputNoofseat =new BigInteger(sc.nextLine());
        v1.setNoofseats(inputNoofseat.intValue());
        System.out.println("Enter screen type:");
        String inputscreentype = sc.nextLine();
        v1.setScreentype(inputscreentype);
        System.out.println("Want snacks:");
        String inputwantsnack = sc.nextLine();
        v1.setWantsnacks(inputwantsnack);

        ViewerInterface v2 = new Viewer();
        System.out.println("===== VIEWER 2 =====");
        System.out.println("Enter number of seats: ");
        BigInteger inputNoofseat1 =new BigInteger(sc.nextLine());
        v1.setNoofseats(inputNoofseat.intValue());
        System.out.println("Enter screen type: ");
        String inputscreentype1 = sc.nextLine();
        v2.setScreentype(inputscreentype1);
        System.out.println("Want snacks: ");
        String inputwantsnack1 = sc.nextLine();
        v2.setWantsnacks(inputwantsnack1);

        if (v1.getScreentype() == "GoldScreen") {
            System.out.println("=====viewer 1 ======");
            int [] [] goldscreen=new int [6] [5];
            goldscreen[0]=new int []{1,2,3,4,5};
            for(int i=0;i<goldscreen.length;i++) {
                if (i != 0) {
                    System.out.print(" ");
                    System.out.println((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldscreen[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print(" ");
                    }
                    System.out.println(goldscreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<v1.getNoofseats();i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBookedSeat = false;
                while (!isValidSeat || !isAlreadyBookedSeat) {
                    try {
                        System.out.println("enter the Seat:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = 65 - ((char) ch[0]);
                        BigInteger seat = new BigInteger(String.valueOf(ch[1]));
                        int finalSeat = seat.intValue() - 1;
                        if (goldscreen[finalRow + 1][finalSeat] == 1) {
                            isAlreadyBookedSeat = true;
                            System.out.println("this seat is already booked,try for a new seat");
                        }
                        goldscreen[finalRow + 1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat = true;
                    } catch (Exception e) {
                        System.out.println("this is invalid seat,please enter the valid seat");
                        isValidSeat = false;
                    }
                }
            }
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
            int [] [] silverscreen=new int [6] [5];
            silverscreen[0]=new int []{1,2,3,4,5};
            for(int i=0;i<silverscreen.length;i++) {
                if (i != 0) {
                    System.out.print(" ");
                    System.out.println((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < silverscreen[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print(" ");
                    }
                    System.out.println(silverscreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<v1.getNoofseats();i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBookedSeat = false;
                while (!isValidSeat || !isAlreadyBookedSeat) {
                    try {
                        System.out.println("enter the Seat:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = 65 - ((char) ch[0]);
                        BigInteger seat = new BigInteger(String.valueOf(ch[1]));
                        int finalSeat = seat.intValue() - 1;
                        if (silverscreen[finalRow + 1][finalSeat] == 1) {
                            isAlreadyBookedSeat = true;
                            System.out.println("this seat is already booked,try for a new seat");
                        }
                        silverscreen[finalRow + 1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat = true;
                    } catch (Exception e) {
                        System.out.println("this is invalid seat,please enter the valid seat");
                        isValidSeat = false;
                    }
                }
            }
            ScreenInterface gs = new GoldScreen("s01", 500, 150, 650);
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
            System.out.println("=====viewer 2 ======");
            int [] [] silverscreen=new int [6] [5];
            silverscreen[0]=new int []{1,2,3,4,5};
            for(int i=0;i<silverscreen.length;i++) {
                if (i != 0) {
                    System.out.print(" ");
                    System.out.println((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < silverscreen[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print(" ");
                    }
                    System.out.println(silverscreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<v1.getNoofseats();i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBookedSeat = false;
                while (!isValidSeat || !isAlreadyBookedSeat) {
                    try {
                        System.out.println("enter the Seat");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = 65 - ((char) ch[0]);
                        BigInteger seat = new BigInteger(String.valueOf(ch[1]));
                        int finalSeat = seat.intValue() - 1;
                        if (silverscreen[finalRow + 1][finalSeat] == 1) {
                            isAlreadyBookedSeat = true;
                            System.out.println("this seat is already booked,try for a new seat");
                        }
                        silverscreen[finalRow + 1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat = true;
                    } catch (Exception e) {
                        System.out.println("this is invalid seat,please enter the valid seat");
                        isValidSeat = false;
                    }
                }
            }
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
            int [] [] goldscreen=new int [6] [5];
            goldscreen[0]=new int []{1,2,3,4,5};
            for(int i=0;i<goldscreen.length;i++) {
                if (i != 0) {
                    System.out.print(" ");
                    System.out.println((char) (65 + i - 1));
                    System.out.print(" ");
                }
                for (int j = 0; j < goldscreen[i].length; j++) {
                    if (i == 0 && j == 0) {
                        System.out.print(" ");
                    }
                    System.out.println(goldscreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<v1.getNoofseats();i++) {
                boolean isValidSeat = false;
                boolean isAlreadyBookedSeat = false;
                while (!isValidSeat || !isAlreadyBookedSeat) {
                    try {
                        System.out.println("enter the Seat:");
                        String row = sc.nextLine();
                        char[] ch = row.toCharArray();
                        int finalRow = ((char) ch[0])-65;
                        BigInteger seat = new BigInteger(String.valueOf(ch[1]));
                        int finalSeat =seat.intValue() - 1;
                        if (goldscreen[finalRow + 1][finalSeat] == 1) {
                            isAlreadyBookedSeat = true;
                            System.out.println("this seat is already booked,try for a new seat");
                        }
                        goldscreen[finalRow + 1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat = true;
                    } catch (Exception e) {
                        System.out.println("this is invalid seat,please enter the valid seat");
                        isValidSeat = false;
                    }
                }
            }
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
        System.out.println("======COMPARISON=====");
        ScreenInterface [] arr = v1.getSn();
        ScreenInterface [] arr1 = v1.getSn();
        if(arr[1].getTotalbill()>arr1[1].getTotalbill()){
            System.out.println("Viewer 1 paid more");
        }
        else if(arr[1].getTotalbill()<arr1[1].getTotalbill()){
            System.out.println("Viewer 2 paid more");
        }
        else{
            System.out.println("Both paid same amount");
        }

    }
}






