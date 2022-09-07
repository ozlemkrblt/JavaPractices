package ManavKasaProgrami;

import java.util.Scanner;

/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam
tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
 */
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00, kg, total ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? : ");
        kg = inp.nextDouble();
        double armutFiyati= armut * kg;
        System.out.print("Elma kaç kilo ? : ");
        kg = inp.nextDouble();
        double elmaFiyati = elma * kg;
        System.out.print("Domates kaç kilo ? : ");
        kg = inp.nextDouble();
        double domatesFiyati = domates * kg;
        System.out.print("Muz kaç kilo : ? ");
        kg = inp.nextDouble();
        double muzFiyati = muz * kg;
        System.out.print("Patlıcan kaç kilo ? : ");
        kg = inp.nextDouble();
        double patlicanFiyati = patlican * kg;
        total = armutFiyati+elmaFiyati + domatesFiyati+ muzFiyati+ patlicanFiyati;
        System.out.println("Toplam Tutar : "+total);
    }
}
