import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        double km, acilis = 10.0, kmBasi = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz(km cinsinden): ");

        km = input.nextDouble();

        double tutar = (km * kmBasi) + acilis;
        boolean minTutar = (tutar <= 20) & (tutar > 0);
        tutar = minTutar ? 20 : tutar;
        System.out.println("Toplam Tutar: " + tutar);
    }
}


