package BuyuktenKucuge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BuyuktenKucuge {

    public static void main(String[] args) {

        int s1,s2,s3;
        List<Integer> sayilar=new ArrayList<Integer>();

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz:");
        s1=scanner.nextInt();
        sayilar.add(s1);

        System.out.print("Lütfen ikinci sayıyı giriniz:");
        s2=scanner.nextInt();
        sayilar.add(s2);

        System.out.print("Lütfen üçüncü sayıyı giriniz:");
        s3=scanner.nextInt();
        sayilar.add(s3);

        Collections.sort(sayilar,Collections.reverseOrder());
        
            System.out.print(sayilar.toString());

        



    }


}
