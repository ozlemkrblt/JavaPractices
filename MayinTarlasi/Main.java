package MayinTarlasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mayın Tarlası Oyununa Hoş Geldiniz !\n"+
        "Tarlanın boyutunu giriniz (satın sütun) şeklinde: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        MineSweeper m1=new MineSweeper(x, y);
        m1.run();

        scanner.close();
    }
    
}
