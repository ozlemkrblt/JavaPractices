package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1 , n2 , secim=1;


        while(secim ==1 || secim ==2|| secim ==3 || secim ==4 ){


            System.out.println("---------------HOŞGELDİNİZ--------------------------------");
            Scanner input= new Scanner(System.in);
            System.out.print( "Sayı 1:");
            n1= input.nextInt();
            Scanner input1= new Scanner(System.in);
            System.out.print( "Sayı 2:");
            n2= input.nextInt();
            Scanner input2= new Scanner(System.in);
            System.out.println( "1:Toplama\n" +"2:Çıkarma\n" +"3:Çarpma\n" +"4:Bölme\n");
            System.out.println( "Yapmak istediğiniz işlemi seçiniz(Çıkmak için 0'a basınız). ");

            secim= input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Sonuç : " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Sonuç : " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Sonuç : " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("Sonuç:" + n1 / n2);
                    } else {
                        System.out.println("0'a bölüm hatası!");
                    }
                    break;
                default:
                    if(secim !=0) {
                        System.out.println("Lütfen bir seçim yapınız...");
                    }


            }
            input.close();
            input1.close();
            input2.close();
        }

    }
}