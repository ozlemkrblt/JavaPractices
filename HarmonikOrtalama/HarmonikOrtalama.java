package HarmonikOrtalama;

public class HarmonikOrtalama {

public static void main(String[] args) {
        double[] numbers = {13.5, 14.5, 14.8, 15.2, 16.1};
        double sum = 0;
        for (double number : numbers) {
                sum += (double) 1 / number;
        }

        System.out.println(numbers.length/sum);
        }

}