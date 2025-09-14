package StreemAPI;

import java.util.Arrays;
import java.util.List;

public class   ShortedEx {
    public static void main(String[] args) {
        shortedEx();
    }
    private static void shortedEx(){
        List<Integer> list = Arrays.asList(12,44,22,4,6,2,1,46,675,33,67,32,567,3333,2,12,45,56);
        list.stream().distinct().sorted().forEach(System.out::println);
    }
}
