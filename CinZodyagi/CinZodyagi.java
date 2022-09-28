package CinZodyagi;

<<<<<<< HEAD
public class CinZodyagi {
    
=======
import java.io.IOException;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) throws IOException {
        String burc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz:");
        int yil = scanner.nextInt();

        int remainder = yil % 12;


        switch (remainder) {
            case 0 -> burc = "Maymun";
            case 1 -> burc = "Horoz";
            case 2 -> burc = "Köpek";

            case 3 -> burc = "Domuz";
            case 4 -> burc = "Fare";
            case 5 -> burc = "Öküz";

            case 6 -> burc= "Kaplan";

            case 7 -> burc= "Tavşan";

            case 8 ->burc= "Ejderha";

            case 9 -> burc= "Yılan";

            case 10 -> burc= "At";

            case 11 -> burc= "Koyun";
            default -> burc="" ;
        }
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
    }
>>>>>>> 3e6286a0b3b02156be67de9be4afbc878ad20bce
}
