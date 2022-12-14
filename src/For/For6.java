package For;
import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input price of candies :");
        int price= input.nextInt();
        double sum = 0;

        for (int i = 12; i <=20 ; i+=2) {
            sum = (double)i*price/10;
            System.out.println((double)i/10 + " kg cost "+ sum );
        }
    }
}
