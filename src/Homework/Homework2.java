package Homework;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input edge of the cube a:");
        double a= input.nextDouble();


        double S = 6*Math.pow(a,2);
        double V = Math.pow(a,3);


        System.out.println("Area of the cube: " + S );
        System.out.println("Volume of the cube: " + V );

    }
}
