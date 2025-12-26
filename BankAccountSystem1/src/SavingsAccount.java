
public class SavingsAccount extends BaseContract implements SavingsAccountInterface{

    private String createFixedDeposit;


    public String getcreateFixedDeposit(){
        return createFixedDeposit;
    }
    public void setcreateFixedDeposit(String name){
        this.createFixedDeposit= name;
    }
}