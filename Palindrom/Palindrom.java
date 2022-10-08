package Palindrom;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Lütfen sayıyı giriniz:");
    String sayi=scanner.nextLine();
    String tersSayi= new StringBuilder(sayi).reverse().toString();
            if(sayi.equals(tersSayi)){
                System.out.println("Sayı Palindromdur");
            }else{
                System.out.println("Sayı Palindrom Değildir.");
            }
        scanner.close();
    }
}
