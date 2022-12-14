package For;
import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input price of candies :");
        int price= input.nextInt();
        double sum = 0;

        for (int i = 1; i <=10 ; i+=1) {
            sum = (double)i*price/10;
            System.out.println((double)i/10 + " kg cost "+ sum );
        }
    }
}
