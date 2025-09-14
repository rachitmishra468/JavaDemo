package CharacterFrequencyCount;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharecterCount {
    public static void main(String[] args) {
        checkCharCount("RachitMishra");
    }


    public static void checkCharCount(String str) {


        Map<Character , Long > map1 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map1.entrySet().stream().forEach(System.out::println);

        Map<Character ,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c , map.getOrDefault(c ,0)+1);
        }

        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" - " +entry.getValue());
        }


    }
}
