package class_object;

import java.util.Scanner;

class Calculator
{
    public int add(int num1, int num2)
    {
        int result = num1 + num2;

        return result;
    }

    public int substract(int num1, int num2)
    {
        int result = num1 - num2;

        return result;
    }

    public int multiplication(int num1, int num2)
    {
        int result = num1 * num2;

        return result;
    }

    public double divide(int num1, int num2)
    {
        double result = num1 / num2;

        return result;
    }
}

public class Main {


    public static void main(String[] args){

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your operation like +,-,*,/: ");
        String operator = scanner.next();


        System.out.println("Enter Your First Number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter Your Second Number: ");
        int num2 = scanner.nextInt();

        switch(operator){

            case "+":
                int add_result = calculator.add(num1, num2);
                System.out.println("Addition Result: " + add_result);
                break;
            
            case "-":
                int subtract_result = calculator.substract(num1, num2);
                System.out.println("Subtract Result: " + subtract_result);
                break;

            case "*":
                int multiplication_result = calculator.multiplication(num1, num2);
                System.out.println("Multiplication Result: " + multiplication_result);
                break;

            case "/":
                double divide_result = calculator.divide(num1, num2);
                System.out.println("Divide Result: " + divide_result);
                break;
            
            default:
                System.out.println("Invalid operation");
                break;
        }

        scanner.close();
    }
}
