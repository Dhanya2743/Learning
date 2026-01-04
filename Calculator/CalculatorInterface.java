package Calculator;

public interface CalculatorInterface {

        public void setCalculatorId(String calculatorId);
        public int getResult();
        public void setResult(int result);
        public UserInterface getUser();
        public void setUser(UserInterface user);
        public void compute();
        public void calculate(int num1,int num2,int num3);
        public void calculate(int num1,int num2);

}

