package programming;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class programmingInterview {

    public static void main(String[] args) {
        String input = "swiss";
      Map<Character , Long > hashMap =  input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     String optional   = hashMap.entrySet().stream().filter(key->key.getValue()<2)
             .map(key-> String.valueOf(key.getKey()))
              .findFirst().orElse("");
          System.out.println(optional);

       /// /////

        String s1 = "listen";
        String s2 = "silent";

        Boolean flag = Arrays.equals(
                s1.chars().sorted().toArray(),s2.chars().sorted().toArray()
        );

        System.out.println(flag);

        List<Integer> al = Arrays.asList(1222,333,4444,666,77,888,45,778,887);
        Long co = al.stream().filter((Integer sa)->sa>500).count();


    }
}
