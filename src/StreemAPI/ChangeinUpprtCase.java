package StreemAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeinUpprtCase {
    public static void main(String[] args) {
        uppercase();
    }
    public static void uppercase(){
        List<String> list = Arrays.asList("Rachit", "mishra" ,"Rachit", "sanchit" ,"sunaina" , "cjaru" , "Anu", "Raha" ,"madan");
          String str = list.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
          System.out.println(str);
    }
}
