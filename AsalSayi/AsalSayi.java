package AsalSayi;

import java.util.ArrayList;

public class AsalSayi {
    public static void main(String[] args) {
      
        String asalSayilar = "";
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count ++;
                }
            }
            if (count == 2) {
                asalSayilar = asalSayilar + i + " ";
            }
        }
        System.out.println(asalSayilar);
       
    }
}
