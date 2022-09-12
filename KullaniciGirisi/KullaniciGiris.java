package KullaniciGirisi;
/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni
girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
"Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

import java.io.IOException;
import java.util.Scanner;

public class KullaniciGiris {

    public static void main(String[] args) {

        String username, password,secim, newPassword ;





            Scanner input= new Scanner(System.in);
            System.out.print(" Kullanıcı adı:  ");
            username=input.nextLine( );

            System.out.print("Şifre: ");
            password=input.nextLine();
            if(!username.equals("ozlem")){
                System.out.println("Hatalı Kullanıcı Adı Girdiniz.");
            }else if(!password.equals("deneme")){ System.out.println(" Yanlış Şifre Girdiniz." +
                    "Şifrenizi sıfırlamak için \"y\", çıkış için \" n\"  secin  ");
                secim=input.nextLine();
                switch(secim){
                    case "n":
                        System.out.println(" Çıkış yapılıyor");
                        break;
                    case "y":
                        System.out.println(" Yeni şifrenizi giriniz:");
                        newPassword=input.nextLine();
                        if(newPassword.equals(password))
                            System.out.println("Eski şifrenizden farklı bir şifre giriniz:");
                        else {
                            System.out.println("Şifreniz başarıyla yenilendi;");
                        }
                        break;
                    default:
                        System.out.println("Seçim yapılmadı... Çıkılıyor.");
                        break;
                }


            }else{
                System.out.println("Başarılı Giriş!");
            }


    }
}
