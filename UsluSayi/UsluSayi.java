package UsluSayi;

import java.util.Scanner;

public class UsluSayi {

    public static int power(int n, int e){
        int result=1;
        for(int i =1; i<=e; i++){
            result *=n;
        }
        return result;
    }
    public static void main(String[] args) {
        int n=0,e=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n=sc.nextInt();
        System.out.print("Kaçıncı kuvvetini bulmak istediğini giriniz: ");
        e=sc.nextInt();
        System.out.println(n+"'in " + e+ ". kuvveti= "+ power(n, e));
        sc.close();
    }
}
