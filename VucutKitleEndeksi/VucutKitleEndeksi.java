package VucutKitleEndeksi;
/*Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 */


import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy,kilo,vki;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Boyunuzu(metre cinsinden) giriniz:");
        boy=scanner.nextDouble();

        System.out.print("Kilonuzu giriniz:");
        kilo= scanner.nextDouble();

        vki= kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz:" + vki);
    }

}
