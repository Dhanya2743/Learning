

public class Main {
    public static void main (String[]  args){

        User user1 = new User();
        User user2 = new User();
        SavingsAccountInterface savingsaccount = new SavingsAccount();
        CurrentAccountInterface currentaccount = new CurrentAccount();

        user1.setownerName("User1");
        user2.setownerName("User2");

        user1.setwithdrawAmt(1000);
        user2.setwithdrawAmt(2000);


        user1.setdepositAmt(10000);
        user2.setdepositAmt(50000);

        user1.setbalance(10000);
        user2.setbalance(50000);

        user1.setacctype("SAVINGS");
        user2.setacctype("CURRENT");

        user1.setaccNo(123456);
        user2.setaccNo(654321);

        savingsaccount.setcreateFixedDeposit("Fixed Deposit Created");
        currentaccount.setenableOverdraft("Overdraft Enabled");

        savingsaccount.setownerName(user1.getownerName());
        currentaccount.setownerName(user2.getownerName());

        savingsaccount.setwithdrawAmt(user1.getwithdrawAmt());
        currentaccount.setwithdrawAmt(user2.getwithdrawAmt());

        savingsaccount.setdepositAmt(user1.getdepositAmt());
        currentaccount.setdepositAmt(user2.getdepositAmt());

        savingsaccount.setbalance(user1.getbalance());
        currentaccount.setbalance(user2.getbalance());

        savingsaccount.setaccNo(user1.getaccNo());
        currentaccount.setaccNo(user2.getaccNo());

        if (user1.getacctype().equals("SAVINGS")){
            System.out.println(savingsaccount.getownerName()+":"+user1.getacctype());
            System.out.println( "Deposited:"+savingsaccount.getdepositAmt());
            System.out.println("Balance:"+savingsaccount.getbalance());
            System.out.println(savingsaccount.getcreateFixedDeposit());
        }
        if(user2.getacctype().equals("CURRENT")){
            System.out.println(currentaccount.getownerName()+":"+user2.getacctype());
            System.out.println( "Deposited:"+currentaccount.getdepositAmt());
            System.out.println("Balance:"+currentaccount.getbalance());
            System.out.println(currentaccount.getenableOverdraft());

        }



















    }
}