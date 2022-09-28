package EtkinlikOnerme;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        String etkinlik;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava Sıcaklığı:");
        int temp = input.nextInt();

        if (temp < 5) {
            etkinlik = "Kayak";
        } else if (5 <= temp && temp < 15) {
            etkinlik = "Film izlemek";
        } else if (15 <= temp && temp < 25) {
            etkinlik = "Piknik yapmak";
        } else {
            etkinlik = "Yüzmek";
        }
        System.out.println("Size en uygun etkinlik: " + etkinlik + "!"
        );

        input.close();
    }
}