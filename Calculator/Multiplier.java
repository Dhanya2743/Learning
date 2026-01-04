package Calculator;

public class Multiplier extends Calculator implements MultiplierInterface{

    public Multiplier(String calculatorId, UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
    }

@Override
    public void compute(){
        int result=getUser().getNum1()*getUser().getNum2()*getUser().getNum3();
        System.out.println("result");
        System.out.println(result);

    }




}
