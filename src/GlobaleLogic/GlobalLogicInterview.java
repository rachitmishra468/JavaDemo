package GlobaleLogic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GlobalLogicInterview {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

       // input

        map.put("am",2);
        map.put("I",1);
        map.put("by",5);
        map.put("map",4);
        map.put("sorted",3);
        map.put("values",6);

//        output
//                ---------
//
//                map.put("I",1);
//        map.put("am",2);
//        map.put("sorted",3);
//        map.put("map",4);
//        map.put("by",5);
//        map.put("values",6);



     Map<String, Integer> sortedmap =   map.entrySet().stream().sorted(Map.Entry.comparingByValue())
             .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue, (e1,e2)->e1 , LinkedHashMap::new));
  System.out.println(sortedmap);

    }
}
