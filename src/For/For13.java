package For;
import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input n:");
        int n= input.nextInt();
        float sum = 0;
        for (int i = 1; i <=n+n ; i+=2) {
            sum=sum+(1+(float)i/10)-(1+(float)i/10+(float)i%2/10);
            System.out.print(1+(float)i/10+"-"+(1+(float)i/10+(float)i%2/10)+"+");



        }
        System.out.println(" = " +sum );
    }
}
