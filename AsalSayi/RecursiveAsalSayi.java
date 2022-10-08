package AsalSayi;

import java.util.Scanner;

public class RecursiveAsalSayi {
    public static int RecursiveAsalSayi(int n,int i){
         
        if (n <= 2) return (n == 2) ? 1 : 0;
        if (n % i == 0) return 0;
        if (i * i > n)return 1;
    
      return RecursiveAsalSayi(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int n=sc.nextInt();
        if(RecursiveAsalSayi(n,2)==1){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal sayı değildir.");
        }
    }
}
