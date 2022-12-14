package Begin;

import java.util.Scanner;

public class Begin6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input length of the edge of a rectangular parallelepiped a:");
        double a = input.nextDouble();
        System.out.println("Input length of the edge of a rectangular parallelepiped b:");
        double b = input.nextDouble();
        System.out.println("Input length of the edge of a rectangular parallelepiped c:");
        double c = input.nextDouble();

        double V = a*b*c;
        double S = 2 *(a*b+a*c+c*b);

        System.out.println("Volume of a rectangular parallelepiped: " + V);
        System.out.println("Area of a rectangular parallelepiped: "+ S);

    }
}
