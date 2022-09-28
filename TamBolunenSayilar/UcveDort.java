package TamBolunenSayilar;

import java.util.Scanner;

//Java döngüler ile 0'dan girilen sayıya kadar olan 
//sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
public class UcveDort {
    public static void main(String[] args) {
        int num = 0, sum = 0, count = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nSayıyı giriniz: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {

                sum += i;
                count++;
            }

        }

        avg = sum / count;
        System.out.println(num + "'e kadar 3 ve 4'e bölünen sayıların ortalaması " + avg + " !");
        scanner.close();
    }
}
