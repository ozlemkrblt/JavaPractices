package MukemmelSayi;

import java.util.Scanner;

/*
 Klavyeden girilen bir sayının mükemmel sayı 
 olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” 
 değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı 
kendisine eşit olan sayıya mükemmel sayı denir.
 */
public class MukemmelSayi {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                total += i;
            }
        }

        if (total == n) {
            System.out.println(n + " bir mükemmel sayıdır.");
        } else {
            System.out.println(n + " bir mükemmel sayı değildir.");
        }
        input.close();
    }
}
