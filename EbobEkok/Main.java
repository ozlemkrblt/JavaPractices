package EbobEkok;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.print("Sayıyı giriniz:");
            Number number=new Number(scanner.nextInt());
            System.out.print("Sayıyı giriniz:");
            int b= scanner.nextInt();

            System.out.println("Sayıların ebobunu bulmak istiyorsanız 1'e ," +
                                "\n ekokunu bulmak istiyorsanız 2'ye basınız.");
            int secim=scanner.nextInt();



            if(secim==1){
                System.out.println(number.EBOB( b));
                    
            }else if(secim==2){
                System.out.println(number.EKOK( b));
            }else{
                System.out.println("Seçim yapmadınız...");

            }
            scanner.close();


        }catch(Exception e){
            e.getMessage();
        }

     
    }
}
