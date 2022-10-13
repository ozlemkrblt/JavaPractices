package DizilerPratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı 
//ve en büyük en yakın sayıyı bulan programı yazınız.
public class MaxMin {
    public static void main(String[] args) {
        Integer[] array={15,12,788,1,-1,-778,2,0};
        List<Integer> arrayL= new ArrayList<Integer>();

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        Integer number=input.nextInt();
        arrayL.addAll(Arrays.asList(array));
        System.out.println("Dizi: " + arrayL.toString());
        arrayL.add(number);
        Collections.sort(arrayL);

        System.out.println("Girilen sayıya en yakın küçük sayı: "+ arrayL.get(arrayL.indexOf(number)-1));
        System.out.println("Girilen sayıya en yakın büyük sayı: "+ arrayL.get(arrayL.indexOf(number)+1));
        input.close();
    }
}
