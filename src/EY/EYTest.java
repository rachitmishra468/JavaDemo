package EY;

import java.util.List;
import java.util.stream.Stream;

public class EYTest {

    public static void main(String[] args) {
        shortList();
    }
    private static void shortList(){

        List<Integer> list = List.of(9,2,3,8);
        List<Integer> list2 = List.of(10,14,5,7);
        List<Integer> list3= Stream.concat(list.stream(),list2.stream()).sorted().toList();
        list3.forEach(System.out::println);


    }
}
