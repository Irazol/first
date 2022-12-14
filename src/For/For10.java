package For;
import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input n:");
        int n= input.nextInt();
        double sum = 0;


        for (int i = 1; i <=n ; i+=1) {
            sum +=(double)1/i;
            System.out.print("1/"+i+"+");
        }
        System.out.println(" = " +sum );
    }
}
