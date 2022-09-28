package Hipotenus;
import java.util.*;

public class Hipotenus{
    public static void main(String[] args) {
        double k1,k2,hipotenus;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Kenar: ");
        k1 = scanner.nextInt();

        System.out.print("2.Kenar: ");
        k2 = scanner.nextInt();

        hipotenus= Math.sqrt((k1*k1) + (k2*k2));

        System.out.println("Hipotenüs: "+hipotenus);
        scanner.close();
    }


}