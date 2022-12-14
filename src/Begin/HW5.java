package Begin;
import java.util.Scanner;

public class HW5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        double a = input.nextDouble();



        double V = Math.pow(a,3);
        double S = 6 *(Math.pow(a,2));

        System.out.println(V);
        System.out.println(S);

    }
}
