package For;
import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input n:");
        int n= input.nextInt();
        int sum = 0;
        for (int i = 1; i <=(2*n-1) ; i+=2) {
            sum+=i;
            System.out.println(sum);
        }

    }
}
