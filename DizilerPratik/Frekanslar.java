package DizilerPratik;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frekanslar {
    public static void main(String[] args) {
        Integer[] array={10, 20, 20, 10, 10, 20, 5, 20};
        Map<Integer,Integer> frequencies=new HashMap<Integer,Integer>();
        for ( Integer i: array){
            if(frequencies.putIfAbsent(i, 1) != null ){        
                frequencies.put(i, frequencies.get(i)+1);   
            }
        }

        System.out.println("Dizi: " + Arrays.toString(array));
        for (Integer key : frequencies.keySet()) {
                System.out.println(key + " sayısı " + frequencies.get(key) + " kez tekrar ediyor.");
        }
    }
}
