package If;
import java.util.Scanner;

public class If5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        int a = input.nextInt();
        System.out.println("Input b");
        int b = input.nextInt();
        System.out.println("Input c");
        int c = input.nextInt();
        int count1  = 0;
        int count2  = 0;

        if(a>=0){
            count1 ++;
        }

        if(b>=0){
            count1 ++;
        }

        if(c>=0){
            count1 ++;
        }

        if(a<0){
            count2 ++;
        }

        if(b<0){
            count2 ++;
        }

        if(c<0){
            count2 ++;
        }

        System.out.println("Number of positive: " + count1);
        System.out.println("Number of negative: " + count2);
    }
}
