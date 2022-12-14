package For;
import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input A:");
        int a= input.nextInt();
        System.out.println("Input B:");
        int b= input.nextInt();
        int sum = 0;

        for (int i = a; i <=b ; i+=1) {
            sum +=i;
        }
        System.out.println("Sum of numbers between "+ a+ " and "+b+" = " +sum );
    }
}
