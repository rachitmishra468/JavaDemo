package GC;

import java.util.*;
import java.util.stream.Collectors;

public class Simplegc {

    public static void main(String[] args) {


        List<String> al = Arrays.asList("rachit" , "mishra" , "Sanchit" ,null , "ajay" ,null);

        List<String> alp = al.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).toList();

        System.out.println(alp);

        int size = Integer.BYTES;

        String s = new String("Rachit");
        System.out.println("Menore of int  "+size);



        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("cherry", 2);
        map.put("date", 5);


      LinkedHashMap<String , Integer> stringIntegerLinkedHashMap=  map.entrySet().stream().sorted(Map.Entry.comparingByValue())
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        System.out.println("Sort hashmap by value  int  "+stringIntegerLinkedHashMap);
    }
}
