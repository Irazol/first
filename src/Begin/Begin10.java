package Begin;
import java.util.Scanner;

public class Begin10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a(must be != 0):");
        double a= input.nextDouble();
        System.out.println("Input b(must be != 0):");
        double b = input.nextDouble();

        System.out.println(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(Math.pow(a,2)-Math.pow(b,2));
        System.out.println(Math.pow(a,2)*Math.pow(b,2));
        System.out.println(Math.pow(a,2)/Math.pow(b,2));

    }
}
