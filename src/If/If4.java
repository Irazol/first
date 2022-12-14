package If;
import java.util.Scanner;

public class If4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        int a = input.nextInt();
        System.out.println("Input b");
        int b = input.nextInt();
        System.out.println("Input c");
        int c = input.nextInt();
        int count  = 0;

        if(a>0){
            count ++;
        }
        if(b>0){
            count ++;
        }
        if(c>0){
            count ++;
        }

        System.out.println(count);


    }
}