package For;
import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input A:");
        int a= input.nextInt();
        System.out.println("Input B:");
        int b= input.nextInt();
        int mult = 1;

        for (int i = a; i <=b ; i+=1) {
            mult *=i;
        }
        System.out.println("Multiplication of numbers between "+ a+ " and "+b+" = " +mult );
    }
}
