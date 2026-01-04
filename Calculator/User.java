package Calculator;

public class User implements UserInterface {
    private int num1;
    private int num2;
    private int num3;
    private String calculatorType;
    private AdderInterface adder;
    private MultiplierInterface multiplier;

    public User() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public AdderInterface getAdder() {
        return adder;
    }

    public void setAdder(AdderInterface adder) {
        this.adder = adder;
    }

    public MultiplierInterface getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(MultiplierInterface multiplier) {
        this.multiplier = multiplier;
    }
}

