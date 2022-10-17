package Palindrom;

import java.util.Scanner;

public class PalindromKelime {
    static boolean isPalindrome(String str) {
        str.toLowerCase();
        String reverse = "";
        boolean result = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
 
        if (str.equals(reverse)) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
        String kelime=input.nextLine();
        if(isPalindrome(kelime)) System.out.println("Kelime Palindromdur.");
        if(!isPalindrome(kelime)) System.out.println("Kelime Palindrom Değildir.");
        input.close();
    }
}
