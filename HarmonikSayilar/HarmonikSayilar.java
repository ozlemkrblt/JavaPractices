package HarmonikSayilar;

import java.util.Scanner;

public class HarmonikSayilar {


    public static double harmonic(double n){

        if(n<2){
            return 1;
        }

        return 1/ n + harmonic(n-1);
    }
    public static void main(String[] args) {
        double n=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        n=scanner.nextDouble();
        scanner.close();
        System.out.println("Sonuc:" + harmonic(n));
       
    }
}
