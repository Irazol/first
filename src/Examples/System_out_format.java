package Examples;

import java.util.Scanner;
class MyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int nn = n%86400;
        System.out.println(nn);
        int a = nn/3600;
        int b = (nn%3600)/60;
        int c = nn%60;

        System.out.println(String.valueOf(a/10) + (a%10)+":"+ b/10+b%10+":"+c/10+c%10);

        }
}
