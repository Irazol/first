// Найти минимальное, максимальное и среднее из трех чисел.

package Homework;
import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        double a = input.nextDouble();
        System.out.println("Input b");
        double b = input.nextDouble();
        System.out.println("Input c");
        double c = input.nextDouble();

        double min = a;
        double max = a;
        double mid = (a+b+c)/3;

        if(b>a && b>c){
            max = b;
        }
        if(c>a && c>b){
            max = c;
        }
        if(b<a && b<c){
            min = b;
        }
        if(c<a && c<b){
            min = c;
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println("Average: " + mid);
    }
}
