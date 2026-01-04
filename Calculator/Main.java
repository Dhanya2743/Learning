package Calculator;
import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String args[]){

        UserInterface user1=new User();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1:");
        BigInteger inputnum1=new BigInteger(sc.nextLine());
        user1.setNum1(inputnum1.intValue());
        System.out.println("enter num2:");
        BigInteger inputnum2=new BigInteger(sc.nextLine());
        user1.setNum2(inputnum2.intValue());
        System.out.println("enter num3:");
        BigInteger inputnum3=new BigInteger(sc.nextLine());
        user1.setNum3(inputnum3.intValue());
        System.out.println("enter calculatortype:");
        String inputcalculatortype=sc.nextLine();
        user1.setCalculatorType(inputcalculatortype);

        UserInterface user2=new User();
        System.out.println("enter num1:");
        BigInteger num1=new BigInteger(sc.nextLine());
        user2.setNum1(num1.intValue());
        System.out.println("enter num2:");
        BigInteger num2=new BigInteger(sc.nextLine());
        user2.setNum2(num2.intValue());
        System.out.println("enter num3:");
        BigInteger num3=new BigInteger(sc.nextLine());
        user2.setNum3(num3.intValue());
        System.out.println("enter calculatortype:");
        String inputcalculatortype1=sc.nextLine();
        user2.setCalculatorType(inputcalculatortype);

        if(user1.getCalculatorType().equals("Add")){
            AdderInterface add=new Adder("MA02",user1);
            add.compute();
            add.calculate(17,8,6);

        }
        else if(user1.getCalculatorType().equals("Multiple")) {
            MultiplierInterface multiplier=new Multiplier("MA03",user1);
            multiplier.compute();

        }
        else{
            System.out.println("this is not a calculatortype");
        }

        if(user2.getCalculatorType().equals("ADD")){
                    AdderInterface add=new Adder("MA04",user2);
                    add.compute();
                    add.calculate(8,9,5);
                }
                else if(user2.getCalculatorType().equals("Multiple")) {
                    MultiplierInterface multiplier=new Multiplier("MA05",user2);
                    multiplier.compute();

                }
                else{
                    System.out.println("this is not a calculatortype");
                }

            }

        }


