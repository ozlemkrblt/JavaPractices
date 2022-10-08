package UsluSayi;

import java.util.Scanner;

public class RecursiveUsluSayi {

    public static int recUslu(int n,int p){
        if(p==0){
            return 1;
        }

        return n* recUslu(n, p-1);
    
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tabanı giriniz:");
        int n= scanner.nextInt();
        System.out.println("Üssü giriniz:");
        int p= scanner.nextInt();
        System.out.println("Sonuç: "+ recUslu(n,p));
    }
}
