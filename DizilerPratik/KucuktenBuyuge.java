package DizilerPratik;

import java.util.Arrays;
import java.util.Scanner;

public class KucuktenBuyuge {
    /*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. 
    Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.*/

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        int size = input.nextInt();
        int[] array = new int[size];

        try{
            System.out.println("Dizinin elemanlarını giriniz :");
            for (int i = 0; i < size; i++) {
                System.out.print((i + 1) + ".Elemanı : ");
                array[i] = input.nextInt();
            }
   
           
        } catch(NegativeArraySizeException e) {
            System.out.println("Geçersiz bir dizi boyutu girdiniz.");
        }

       Arrays.sort(array);
       System.out.println("Sıralama: " + Arrays.toString(array));
       input.close();
    }
    }

