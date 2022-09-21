package UcakBiletiFiyatı;
/*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
Mesafe başına ücret 0,10 TL / km olarak alın. 
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
 aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, 
yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" 
şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

*/

import java.io.IOException;
import java.util.Scanner;


class UBilet {
    int tip;
    int km;
    double ucret;
    final double _SABIT = 0.10;

    public UBilet(int tip, int km) {
        this.tip = tip;
        this.km = km;
        this.ucret = 0.10 * km;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public double getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public void indirim(int yas) {
        if (yas < 12) {
            this.ucret -= (this.ucret * 0.5);
        } else if (yas >= 12 && yas <= 24) {
            this.ucret -= (this.ucret * 0.1);
        } else if (yas > 65) {
            this.ucret -= (this.ucret * 0.3);
        }

        if (this.tip == 2) {
            this.ucret -= (this.ucret * 0.2);
            this.ucret= this.ucret *2 ;
        }

    }

    @Override
    public String toString() {
        return  "Toplam Tutar: " + ucret ;
    }

    
}

public class UBiletFiyati {
    public static void main(String args[]) throws IOException{
       

        int tip=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz: ");
        int km= sc.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        int yas= sc.nextInt();

        while(tip!=1 && tip!=2){
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = sc.nextInt();

        
        if(tip !=1 && tip != 2 ){
            System.out.println("Hatalı Veri Girdiniz! Tekrar giriniz");
            
        }

        }
        sc.close();

        if(yas <0 || km <0 ) throw new IOException("Hatalı Veri Girdiniz.");
        UBilet bilet=new UBilet(tip, km);
        bilet.indirim(yas);
        System.out.println(bilet.toString());
        
    
    }
    
}
