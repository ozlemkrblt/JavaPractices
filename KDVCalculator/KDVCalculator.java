package KDVCalculator;

import java.util.Scanner;
public class KDVCalculator {
    public static void main(String[] args) {
        double fiyat, kdv, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz:");
        fiyat = input.nextDouble();

        boolean cond = fiyat <= 1000;

        kdv = cond ? 0.18 : 0.08;
        kdvTutar = kdv * fiyat;
        kdvliTutar = kdvTutar + fiyat;

        System.out.println("Ürünün KDV'siz Fiyatı : " + fiyat);
        System.out.println("KDV Oranı : " + kdv);
        System.out.println("Ürünün KDV'li Fiyatı : " + kdvliTutar);

        System.out.print("KDV Tutarı : " + kdvTutar);

    }
}