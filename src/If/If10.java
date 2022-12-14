package If;
import java.util.Scanner;

public class If10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        int a = input.nextInt();
        System.out.println("Input b");
        int b = input.nextInt();
        int sum = a+b;


        if(a!=b){
            a = sum;
            b = sum;
        }
        else{
            a = 0;
            b = 0;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
