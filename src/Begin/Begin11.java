package Begin;
import java.util.Scanner;

public class Begin11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a(must be != 0):");
        double a= input.nextDouble();
        System.out.println("Input b(must be != 0):");
        double b = input.nextDouble();

        System.out.println(Math.abs(a)+Math.abs(b));
        System.out.println(Math.abs(a)-Math.abs(b));
        System.out.println(Math.abs(a)*Math.abs(b));
        System.out.println(Math.abs(a)/Math.abs(b));

    }
}
