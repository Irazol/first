package If;
import java.util.Scanner;

public class If6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        int a = input.nextInt();
        System.out.println("Input b");
        int b = input.nextInt();


        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
