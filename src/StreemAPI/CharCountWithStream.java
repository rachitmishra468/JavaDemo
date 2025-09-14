package StreemAPI;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountWithStream {

    public static void main(String[] args) {
        charCount();
    }


    private static void charCount(){
        String name = "RachitMishra";

        Map<Character,Long> characterIntegerMap = name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity() ,Collectors.counting() ));

        for(Map.Entry<Character ,Long> entry :characterIntegerMap.entrySet()){}
        System.out.println(characterIntegerMap);



    }
}
