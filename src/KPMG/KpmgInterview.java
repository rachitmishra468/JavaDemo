package KPMG;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KpmgInterview {
    public static void main(String[] args) {

        String Str ="engineering";

      String s =  Str.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
      System.out.println(s);

//         Str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
//                 .stream().filter(e->e.getValue()<2).forEach(System.out::println);

    }
}
