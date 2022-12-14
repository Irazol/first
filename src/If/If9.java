package If;
import java.util.Scanner;

public class If9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        int a = input.nextInt();
        System.out.println("Input b");
        int b = input.nextInt();
        int tmp = 0;


        if(a>b){
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
