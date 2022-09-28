package TekSayilarToplami;
/* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen 
değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz. */

import java.util.Scanner;

public class TekSayilarToplami {
    public static void main(String[] args) {
        int giris=1, sayi=0,sum=0;
        Scanner scanner=new Scanner(System.in);

        while(giris==1){
            
            System.out.println("Bir sayı giriniz: ");
            sayi= scanner.nextInt();
            if(sayi%2==1){
                giris=0;
                System.out.println("Tek sayı girdiniz. Programdan çıkılıyor...");
            }else if(sayi%2==0 ){
                if(sayi%4==0){
                    sum+= sayi;
                }
            }
        }
        System.out.println("4'ün katı olan (ve çift) sayıların toplamı= " + sum );
        scanner.close();
    }
}
