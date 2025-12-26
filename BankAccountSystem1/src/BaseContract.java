public abstract class BaseContract implements BaseContractInterface {
    private int depositAmt;
    private int withdrawAmt;
    private int accNo;
    private int balance;
    private String ownerName;
    private String acctype;

    public int getdepositAmt(){
        return this.depositAmt;
    }
    public void setdepositAmt(int depamt ){
        this.depositAmt = depamt;
    }

    public int getwithdrawAmt(){
        return this.withdrawAmt;
    }
    public void setwithdrawAmt(int depamt ){
        this.withdrawAmt = depamt;
    }

    public int getaccNo(){
        return this.accNo;
    }
    public void setaccNo(int accNo){
        this.accNo = accNo;
    }

    public int getbalance(){
        return this.balance;
    }
    public void setbalance(int bal){
        this.balance= bal;
    }

    public String getownerName(){
        return ownerName;
    }

    public void setownerName(String name){
        this.ownerName = name;
    }

    public String getacctype(){
        return acctype;
    }
    public void setacctype(String name){
        this.acctype= name;
    }
}
