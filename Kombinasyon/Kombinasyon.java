package Kombinasyon;

import java.util.Scanner;

//C(n,r) = n! / (r! * (n-r)!)

public class Kombinasyon {

    public static int combination(int n, int r) {
        int result = 0;

        int R = recFactorial(r) * recFactorial(n - r);
        result = recFactorial(n) / R;

        return result;
    }

    public static int recFactorial(int n) {
        if (n == 0)
            return 1;

        return n * recFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n=0 , r=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("...İki sayıyı sırasıyla giriniz...");
        System.out.print("n: ");
        n= scanner.nextInt();
        System.out.print("r: ");
        r= scanner.nextInt();

        System.out.println(n +"'in " + r +  "li kombinasyonu: " + combination(n, r));
        scanner.close();   
    }
}
