package For;
import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input n:");
        int n= input.nextInt();
        double multi = 1;
        for (int i = 1; i <=n ; i+=1) {
            multi *=((double)i/10+1);
            System.out.print((double)i/10+1 + "*");

        }
        System.out.println(" = " +multi );
    }
}
