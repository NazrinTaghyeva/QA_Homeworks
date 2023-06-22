package CalculatorWithOOP;

import java.util.Scanner;

public class CalculatorUtil {

    Calculator calculator = new Calculator();


    public void calculatorOperation() {

        Scanner sc = new Scanner(System.in);
        boolean answer = true;

        while (answer) {
            System.out.println("Enter first Number...");
            int firstNumber = sc.nextInt();
            System.out.println("Enter second Number...");
            int secondNumber = sc.nextInt();
            System.out.println("What do you want? +,-,*,/");
            String operation = sc.next();

            switch (operation) {
                case "+":
                    System.out.println(calculator.sum(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println(calculator.subst(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println(calculator.multiple(firstNumber, secondNumber));
                    break;
                case "/":
                    if (secondNumber != 0) {
                        if (firstNumber % secondNumber == 0) {
                            System.out.println(calculator.divide(firstNumber, secondNumber));
                        } else {
                            System.out.println(calculator.divideDouble(firstNumber, secondNumber));
                        }
                    } else {
                        System.out.println("Second number should be different 0...");
                    }
                    break;
                default:
                    System.out.println("This operation is invalid.....");
            }

            System.out.println("Do you want continue calculator? Yes/No");
            String userAnswer = sc.next();
            if (userAnswer.equalsIgnoreCase("Yes")) {
                answer = true;
            } else {
                answer = false;
            }
        }
    }
}