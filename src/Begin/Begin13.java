package Begin;
import java.util.Scanner;

public class Begin13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input outer circle radius r1:");
        double r1= input.nextDouble();
        System.out.println("Input inner circle radius r2:");
        double r2 = input.nextDouble();
        double p = 3.14;

        double s1 = 2*p*Math.pow(r1,2);
        double s2 = 2*p*Math.pow(r2,2);
        double s3 = s1-s2;

        System.out.println("Outer circle area: " + s1 );
        System.out.println("Inner circle area: " + s2 );
        System.out.println("Ring area: " + s3 );
    }
}
