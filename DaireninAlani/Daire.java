package DaireninAlani;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        System.out.print("Daire Diliminin Alanını Hesaplama ");
        double r, a, daireAlani;
        final double pi = Math.PI;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");

        r = input.nextDouble();
        System.out.print("Açıyı giriniz: ");
        a = input.nextDouble();
        daireAlani = (pi * (r * r) * a) / 360;

        System.out.println("Alan " + daireAlani);
    }
}