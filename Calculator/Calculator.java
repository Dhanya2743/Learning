package Calculator;

    public abstract class Calculator implements CalculatorInterface {
        private String calculatorId;
        private int result;
        private UserInterface user;

        public String getCalculatorId() {
            return calculatorId;
        }

        public void setCalculatorId(String calculatorId) {
            this.calculatorId = calculatorId;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }
        public UserInterface getUser() {
            return user;
        }

        public void setUser(UserInterface user) {
            this.user = user;
        }

        public void compute(){
            int result=getUser().getNum1()+getUser().getNum2()+getUser().getNum3();
            System.out.println("Adder result");
        }
        //overloading
        public void calculate(int num1,int num2,int num3){
            int add=num1+num2+num3;
            System.out.println(add);
        }
        public void calculate(int num1,int num2){
            int multiply=num1*num2;
            System.out.println(multiply);
            System.out.println(result);

        }


    }

