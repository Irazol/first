// Найти минимальное и максимальное число из двух переменных

package Homework;
import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        int a = input.nextInt();
        System.out.println("Input b");
        int b = input.nextInt();


        if(a>b){
            System.out.println("Max number: " + a);
            System.out.println("Min number: " + b);
        }
        else{
            System.out.println("Max number: " + b);
            System.out.println("Min number: " + a);
        }
    }
}