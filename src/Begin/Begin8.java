package Begin;
import java.util.Scanner;

public class Begin8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a:");
        double a= input.nextDouble();
        System.out.println("Input b:");
        double b = input.nextDouble();

        double mid = (a+b)/2;

        System.out.println("Arithmetic average " + mid);

    }
}