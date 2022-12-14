package For;
import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input price of candies :");
        double price= input.nextDouble();
        double sum = 0;

        for (int i = 1; i <11 ; i++) {
            sum = i*price;
            System.out.println(i + " kg cost "+ sum );
        }
    }
}
