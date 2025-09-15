package HCL;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HCLInterview {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 40);

        System.out.println(map);

       // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

       // map.entrySet().stream().sorted(Map.Entry.<String , Integer>comparingByValue().reversed()).forEach(System.out::println);



        String str = "123abc356cdef678fgh";

        String digit = str.chars().filter(Character ::isDigit).mapToObj(c->(char)c).distinct().map(String::valueOf)                        // char -> String
                .collect(Collectors.joining());

        String Strt = str.chars().filter(Character::isAlphabetic).mapToObj(c->(char)c).distinct().map(String::valueOf)
                .collect(Collectors.joining());

       // System.out.println(digit);
       // System.out.println(Strt);

       String p= str.chars().filter(Character::isAlphabetic).distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(p);

        str.chars().filter(Character ::isDigit).mapToObj(c->(char)c).distinct().map(String::valueOf).collect(Collectors.joining());


    }
}
