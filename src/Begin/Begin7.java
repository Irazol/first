package Begin;
import java.util.Scanner;

public class Begin7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input radius of the circle r:");
        double r = input.nextDouble();
        double p = 3.14;

        double L = 2*p*r;
        double S = 2*p*(Math.pow(r,2));

        System.out.println("Length of the circle " + L);
        System.out.println("Area of the circle "+ S);

    }
}