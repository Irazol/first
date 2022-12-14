package For;
import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input A:");
        int a= input.nextInt();
        System.out.println("Input B:");
        int b= input.nextInt();
        int sump = 0;

        for (int i = a; i <=b ; i+=1) {
            sump +=Math.pow(i,2);
            System.out.print(i*i+"+");
        }
        System.out.println(" = " +sump );
    }
}
