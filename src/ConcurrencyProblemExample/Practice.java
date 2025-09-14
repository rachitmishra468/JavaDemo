package ConcurrencyProblemExample;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {


    public final String string;

     Practice(String n){
         this.string=n;
     }
    public static void main(String[] args) {
        findDuplicate("RachitMishra");
    }

    private static void findDuplicate(String str){

    "jvbklbdfxjvldxlvjkhcvjgskfdich".chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
              .filter(m->m.getValue()>1).forEach(System.out::println);

    }
}
