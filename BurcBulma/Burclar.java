package BurcBulma;

import java.util.Scanner;

public class Burclar {

    public static void main(String[] args) {

        int ay, gun;
        String burc = "";

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Lütfen doğduğunuz ayı giriniz:");

            ay = scanner.nextInt();
            System.out.println("Lütfen hangi gün doğduğunuzu giriniz:");
            gun = scanner.nextInt();
            scanner.close();
            if (ay >= 1 && ay <= 12 && gun >= 1 && gun <= 31) {
                if (ay == 1)
                    burc = gun == 21 ? "Oğlak" : "Kova";
                if (ay == 2)
                    burc = gun == 21 ? "Kova" : "Balık";
                if (ay == 3)
                    burc = gun == 21 ? "Balık" : "Koç";
                if (ay == 4)
                    burc = gun == 21 ? "Koç" : "Boğa";
                if (ay == 5)
                    burc = gun == 21 ? "Boğa" : "İkizler";
                if (ay == 6)
                    burc = gun == 21 ? "İkizler" : "Yengeç";
                if (ay == 7)
                    burc = gun == 21 ? "Yengeç" : "Aslan";
                if (ay == 8)
                    burc = gun == 21 ? "Aslan" : "Başak";
                if (ay == 9)
                    burc = gun == 21 ? "Başak" : "Terazi";
                if (ay == 10)
                    burc = gun == 21 ? "Terazi" : "Akrep";
                if (ay == 11)
                    burc = gun == 21 ? "Akrep" : "Yay";
                if (ay == 12)
                    burc = gun == 21 ? "Yay" : "Oğlak";
                System.out.println("Burcunuz:" + burc);
            } else {
                throw new Exception("Lütfen geçerli bir tarih giriniz");
            }

        } catch (Exception e) {
            
            e.printStackTrace();

        }
        scanner.close();
    }
}
