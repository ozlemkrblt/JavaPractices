import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        int mat = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        int fiz = scanner.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        int tur = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        int kim = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        int mzk = scanner.nextInt();

        int top= mat + fiz + tur + kim + mzk;
        if (top / 5 >= 55 && top> 500 && top < 0) {
            System.out.println("Sınıfı Başarıyla Geçtiniz");
        } else if (top / 5 < 55) {
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Geçerli not giriniz");
        }
    }
}