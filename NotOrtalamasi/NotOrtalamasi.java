import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        ort = (mat + fizik + kimya + turkce + tarih + muzik)/6;
        String output = (ort > 60) ? "Sınıfı geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalamanız: "+ort+"\nGeçme Durumu: "+output);
        input.close();
    }
}