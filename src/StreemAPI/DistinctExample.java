package StreemAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        distinctex();
    }

    private static void distinctex(){
        List<Integer> list = Arrays.asList(1,3,2,44,53,53,63,67,23,2,5,45,356,22,56,226,3);
       // list.stream().distinct().forEach(System.out::println);
       List<Integer> p = list.stream().distinct().toList();
       System.out.println(p);
    }
}
