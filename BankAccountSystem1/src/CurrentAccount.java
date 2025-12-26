

public class CurrentAccount extends BaseContract implements CurrentAccountInterface{

    private String enableOverdraft;


    public String getenableOverdraft(){
        return enableOverdraft;
    }
    public void setenableOverdraft(String name){
        this.enableOverdraft= name;
    }

}
