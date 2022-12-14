//Сделать программу калькулятор.

package Homework;
import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input first number:");
        double num1 = input.nextDouble();
        System.out.println("Input operator:");
        char operator = input.next().charAt(0);
        System.out.println("Input second number:");
        double num2 = input.nextDouble();
        double result;

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("wrong operator");
                break;
        }
    }
}