import java.util.Scanner;
public class Calculator1_7 {
    Scanner input = new Scanner(System.in);
    public void calculate () {

        System.out.println("SIMPLE CALCULATOR");
    }
    class Input_choice extends Calculator1_7 {
        public void calculate() {
            System.out.println("Enter your choice (+, - , /, *): ");
            String user_choice = input.nextLine();
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            if (user_choice.equals("+") ) {
                addition1_7 add = new addition1_7();
                add.getInput(num1, num2);

            } else if (user_choice.equals("-") ) {
                subtraction1_7 subtract = new subtraction1_7();
                subtract.getInput(num1, num2);
            } else if (user_choice.equals("*") ) {
                Multiplication1_7 multiply = new subtraction1_7();
                multiply.getInput(num1, num2);
            } else if (user_choice.equals("/") ) {
                Division1_7 div = new Division1_7();
                div.getInput(num1, num2);
            } else {
                System.out.println("Invalid");
            }

            }
        }
    }


