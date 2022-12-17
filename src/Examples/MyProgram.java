package Examples;

import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int  a= sc.nextInt(),
                b=sc.nextInt(),
                c=sc.nextInt(),
                x;
        if (a>b){x=a;a=b;b=x;}
        if (b>c){x=b;b=c;c=x;}
        if (a>b){x=a;a=b;b=x;}

        System.out.print(a+"\n"+b+"\n"+c);

    }
}
