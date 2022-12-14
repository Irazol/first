package Homework;
import java.util.Scanner;
public class Homework1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input side of the triangle a:");
        double a= input.nextDouble();
        System.out.println("Input side of the triangle b:");
        double b= input.nextDouble();
        System.out.println("Input side of the triangle c:");
        double c= input.nextDouble();

        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));


        System.out.println("Area of the triangle: " + s );

    }
}
