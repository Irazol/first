package For;
import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input n:");
        int n= input.nextInt();
        int sum = (int) Math.pow(n,2);
        System.out.print(sum + "+");


        for (int i = 1; i <=n ; i+=1) {
            sum +=Math.pow((n+i),2);
            System.out.print((int)Math.pow((n+i),2) + "+");

        }
        System.out.println(" = " +sum );
    }
}
