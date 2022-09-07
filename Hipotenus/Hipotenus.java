/*Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/

import java.*;
public class Hipotenus{
    public static void main(String[] args) {
        double k1,k2,hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenar: ");
        k1 = input.nextInt();

        System.out.print("2.Kenar: ");
        k2 = input.nextInt();

        hipotenus= Math.sqrt((k1*k1) + (k2*k2));

        System.out.println("Hipotenüs: "+hipotenus);
    }


}