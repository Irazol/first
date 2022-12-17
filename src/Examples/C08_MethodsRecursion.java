package Examples;

import java.util.Scanner;
public class C08_MethodsRecursion {
    // Знаходження найбільшого загального дільника (НДД) двох цілих чисел

    // Перший варіант

    static int calculate(int a, int b) {
        if (a % b == 0)
            return b;
        else
            System.out.println(a % b);
            return calculate(b, a % b);
    }
    static int calculate2(int a, int b) {
        while (b != 0){
            b = a % (a = b);
        System.out.println(b+" "+a);}
        return a;
    }


    public static void main(String[] args) {
        System.out.println("Знаходження найбільшого спільного дільника двох цілих чисел");
        Scanner input = new Scanner(System.in);
        System.out.println("Input some numbers:");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("a = " + a + ", b = " + b + ", НЗД = " + calculate(a, b) + ";");
        System.out.println("a = " + a + ", b = " + b + ", НЗД = " + calculate2(a, b) + ";");
    }



    // Другий варіант вирішення


}
