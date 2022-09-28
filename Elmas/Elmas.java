package Elmas;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args)
    {
        int sayi = 4, i, j;

        for (i = 1; i <= sayi; i++) {
 
            for (j = 1; j <= sayi - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = sayi - 1; i > 0; i--) {
 
            for (j = 1; j <= sayi - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

