package FirstNonRepeatingChar;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharEx {

    public static void main(String[] args) {
        String str ="swiss";
        Map<Character , Long > map = str.chars().mapToObj(c->(char)c).collect(
                Collectors.groupingBy(Function.identity() , Collectors.counting())
        );

        Optional<Character> optional = map.entrySet().stream()
                .filter(key->key.getValue()==1)
                .map(Map.Entry ::getKey )
                .findFirst();

        System.out.println(optional.orElse(null));
    }
}
