package MaxSayi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxSayi {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();


        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz? ");
        int n= scanner.nextInt();


        for (int i=1; i<=n ; i++){
            System.out.println(i + ". sayıyı giriniz: ");
            int a=scanner.nextInt();
            list.add(a);
            
        }
        scanner.close();
        Collections.sort(list);
        System.out.println("En büyük sayı: " + list.get(n-1));
        System.out.println("En küçük sayı: " + list.get(0));
    }
}
