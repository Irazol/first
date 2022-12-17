package Examples;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long tmp = 0;
        long start = 1;
        if (n==0)System.out.println(tmp);
        if (n==1)System.out.println(start);
        for (int i = 2; i < n+1; i++) {
            long next = tmp%((long) Math.pow(10,9)+7) + start%((long) Math.pow(10,9)+7);
            tmp = start;
            start = next;
        }

        if(n>1)System.out.println(start);
    }
}