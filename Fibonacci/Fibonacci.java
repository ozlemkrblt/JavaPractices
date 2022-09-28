package Fibonacci;

import java.util.Scanner;
import EbobEkok.Number;

//It uses Number class in EbobEkok Folder. All Number operations are done in that class.
public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        try{
        System.out.print("Eleman sayısını giriniz: ");
        int length=sc.nextInt();
        Number number=new Number(length);
        sc.close();
        number.fibonacci();
        }catch(Exception e){
            e.getMessage();
        }

        
    }
    
}
