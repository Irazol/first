package While;

import java.util.Scanner;
public class While1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a");
        int a = input.nextInt();
        System.out.println("Input b");
        int b = input.nextInt();
        while(a>b){
            a-=b;
        }
    System.out.println(a);
    }
}
