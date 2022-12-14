package Begin;
import java.util.Scanner;

public class Begin9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a(must be > 0):");
        double a= input.nextDouble();
        System.out.println("Input b(must be > 0):");
        double b = input.nextDouble();

        double mid =Math.sqrt(a*b) ;

        System.out.println("Geometric average " + mid);

    }
}