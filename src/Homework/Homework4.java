package Homework;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input some five-digit  number n:");
        int n= input.nextInt();

        int sum = n%10 + (n/10)%10 + (n/100)%10 + (n/1000)%10 + n/10000 ;

        System.out.println(sum);

    }
}
