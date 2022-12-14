//создать программу по вычислению дискриминанта

package Homework;
import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть a:");
        double a = input.nextDouble();
        System.out.println("Введіть b:");
        double b = input.nextDouble();
        System.out.println("Введіть c:");
        double c = input.nextDouble();

        double d = Math.pow(b,2) - 4*a*c;
        System.out.println("Дискримінант D = " +d);


        if(d>0){
            double x1 = (-b+Math.sqrt(d))/(2*a);
            double x2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("Рівняння має два корені:");
            System.out.println("Корінь x1 = "+ x1);
            System.out.println("корінь x2 = "+ x2);
        }
        else if(d == 0){
            double x1 = -b/(2*a);
            System.out.println("Рівняння має один корінь:");
            System.out.println("Корінь x1 = "+ x1);
        }
        else {
            System.out.println("Рівняння не має коренів");
        }
    }
}

