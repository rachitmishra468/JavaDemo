package interview;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ClassA {
    public static void main(String[] args) {
        duplicate();
    }

    private static void duplicate(){

        String str ="abcabcbb";
        Map<Character , Long> map = str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Size "+map.size());
        for(Map.Entry<Character ,Long> entry :map.entrySet()){
            System.out.println(entry.getKey() +" -- "+ entry.getValue());
        }}




// 1.Given a string s, find the length of the longest substring without repeating characters.
//Example 1:
//Input: s = "abcabcbb";
    //output = "abc";
}
