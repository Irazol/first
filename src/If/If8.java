package If;
import java.util.Scanner;

public class If8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        int a = input.nextInt();
        System.out.println("Input b");
        int b = input.nextInt();
        int max = 0;
        int min = 0;

        if(a>b){
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
