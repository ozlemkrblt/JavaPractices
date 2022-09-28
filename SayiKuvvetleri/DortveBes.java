package SayiKuvvetleri;
/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı 
yazıyoruz.*/

import java.util.Scanner;

public class DortveBes {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();
        System.out.println("2'nin Kuvvetleri:");
        for (int i=1 ; i<=sayi ; i*=2){
            System.out.print(i +" ");
        }
        System.out.println("\n4'ün Kuvvetleri:");
        for (int j=1 ; j<=sayi ; j*=4){
            System.out.print(j +" ");
        }
        scanner.close();
    }
}
