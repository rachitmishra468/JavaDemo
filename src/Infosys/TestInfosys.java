package Infosys;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestInfosys {

    public static void main(String[] args) {

        String str = "RachitMishra"; // Input String
        checkDublicate(str);


    }


    private static void checkDublicate(String str) {


        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Character, Long> entry : map.entrySet()) {

            if(entry.getValue()<2){
                System.out.println(entry.getKey());
            }
        }


    }

}
