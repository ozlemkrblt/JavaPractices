package BasamaklarToplami;

import java.util.Scanner;

public class BasamakToplami {

    public static int digitSum(int n){

        if(n==0 ){
            return 0; 
        }

        return (n%10) + digitSum(n/10);
        

    }
    public static void main(String[] args) {
        int n=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        n=scanner.nextInt();
        System.out.print("Sayının basamaklar toplamı: " + digitSum(n));
        
        scanner.close();
    }
}
