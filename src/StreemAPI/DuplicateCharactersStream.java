package StreemAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateCharactersStream {
    public static void main(String[] args) {
        String str = "programming";
        findDuplicates(str);
    }

    private static void findDuplicates(String s) {


        Map<Character, Long> duplicate = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        duplicate.entrySet().stream().filter(m -> m.getValue() > 1).forEach(System.out::println);


    }


}
