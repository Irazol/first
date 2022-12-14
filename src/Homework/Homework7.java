// 3.Создать программу которая по вводимому числу: выводит доброе утро(1-12), добрый день(12-20),  доброй ночи(20-24).

package Homework;
import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input n(in range 0-23)");
        int n = input.nextInt();

        if(n>0 && n<12){
            System.out.println("Good morning");
        }
        else if(n>=12 && n<20){
            System.out.println("Good day");
        }
        else if(n>=20 && n<24){
            System.out.println("Good evening");
        }
    }
}
