package RecursivePattern;

import java.util.Scanner;

/*Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
Yine her ekleme işleminde sayının son değerini ekrana yazdırın. */
public class RecursivePattern {

    public static void pattern(int n,int count){
        System.out.print(n + " ");


        if(count !=5 ){
            if(n > 0 ){
                pattern(n-5,count+1); 
                
            }else{
                pattern(n+5,count+1);

        }
    }
    }

       
    


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayıyı giriniz:");
        int n= scanner.nextInt();
        pattern(n,1);
    }
}
