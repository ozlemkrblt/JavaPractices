package ArtikYil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args){
        int yil;
        System.out.println("Yıl giriniz: ");
        Scanner sc = new Scanner(System.in);
        yil = sc.nextInt();

        if (((yil % 4 == 0) && (yil % 100!= 0)) || (yil%400 == 0))
            System.out.println("Artık yil.");
        else
            System.out.println("Artık yil değil.");
    }
}
