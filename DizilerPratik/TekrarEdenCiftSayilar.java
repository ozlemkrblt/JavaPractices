package DizilerPratik;

import java.util.HashMap;
import java.util.Map;

public class TekrarEdenCiftSayilar {
    
    public static void main(String[] args) {
        Integer[] array={0,2,4,19,2,19,23,22,22,-12,-4,378,24,0,1,3,-12,-12};
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for ( Integer i: array){
            if(map.putIfAbsent(i, 1) != null ){        
                map.put(i, map.get(i)+1);   
            }
        }

        for (Integer key : map.keySet()) {
            if(key %2 ==0  && map.get(key) > 1 ){
                System.out.println(key + " sayısı " + map.get(key) + " kez tekrar ediyor.");
            }
            
        }
    }
}
