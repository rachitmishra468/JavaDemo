package StreemAPI;

import java.util.Arrays;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        mapExample();

    }
    private static void mapExample(){
        List<Integer> list = List.of(11,44,22,55,33,23,3224,55,22,56);
        list.stream().map(x->x*x).forEach(System.out::println);


        List<String> list2 = Arrays.asList("Rachit", "mishra" ,"Rachit", "sanchit" ,"sunaina" , "cjaru" , "Anu", "Raha" ,"madan");
         list2.stream().map(x->x.length()).forEach(System.out::println);
    }
}
