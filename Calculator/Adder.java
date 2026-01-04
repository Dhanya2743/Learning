package Calculator;

public class Adder extends Calculator implements AdderInterface{

    public Adder(String calculatorId,UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
    }

}
