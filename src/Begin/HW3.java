package Begin;
import java.util.Scanner;


public class HW3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        double a = input.nextDouble();
        System.out.println("Input b");
        double b = input.nextDouble();


        double S = a*b;
        double P = 2 *(a+b);

        System.out.println(P);
        System.out.println(S);

    }

}