package Begin;
import java.util.Scanner;

public class Begin12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input leg of a right triangle a:");
        double a= input.nextDouble();
        System.out.println("Input leg of a right triangle b:");
        double b = input.nextDouble();

        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double p = a+b+c;

        System.out.println("Hypotenuse of a right triangle " + c );
        System.out.println("Perimeter of a right triangle " + p );
    }
}
