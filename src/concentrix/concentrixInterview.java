package concentrix;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class concentrixInterview {


    public static void main(String[] args) {
        int[] al = {2, 4, 6, 7, 88, 8, 8, 8, 4, 6, 7, 3, 2, 1, 8};
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < al.length; i++) {
            hashMap.put(al[i], hashMap.getOrDefault(al[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Value " + entry.getKey() + " Count  " + entry.getValue());
            }

        }


        Map<Integer , Long> map = Arrays.stream(al).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Map.Entry<Integer, Long> s : map.entrySet()){
            System.out.println(s.getKey()+" - cound - "+s.getValue());
        }
    }}