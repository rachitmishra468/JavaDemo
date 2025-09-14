package StreemAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompratorStreem {
    public static void main(String[] args) {
        compratorex();
    }
    public static void compratorex(){
        List<String> list = Arrays.asList("Rachit", "mishra" ,"Rachit", "sanchit" ,"sunaina" , "cjaru" , "Anu", "Raha" ,"madan");
        list.stream().sorted(Comparator.comparing(str-> str.length())).forEach(System.out::println);

    }
}
