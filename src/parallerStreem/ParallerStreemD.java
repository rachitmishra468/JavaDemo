package parallerStreem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallerStreemD {
    public static void main(String[] args) {
        runPrallerStreem();
    }


    public static void runPrallerStreem(){
        List<Integer> ls =  Arrays.asList(1,2,43,54,6,75,78,333,88,90,34,670);
       // ls.stream().filter(n->(n>100)).toList();
        ls.parallelStream()
                .filter(n-> (n<=100))

                .forEach(System.out::println);

    }
}
