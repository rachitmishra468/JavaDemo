package capgemini;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        String abc = "RachitMishra";
        String special ="@";
        int n =2;
        StringBuilder stb = new StringBuilder() ;
        for(int i=1 ; i<=abc.length(); i++){ // 0,1,2
            stb.append(abc.charAt(i-1));
            if(i%n==0){
                stb.append(special);
            }
        }
        System.out.println(stb);




        String name = "wwddddrrrrrkdhhdhdheuhuhwjwjwejbbbb";
        Map<Character , Long> map = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);


        List<Long> al = map.entrySet().stream().map(e->e.getValue()).toList();
        System.out.println(al);

        Long p = al.stream().sorted(Comparator.reverseOrder()).toList().get(1);
        System.out.println(p);

    }
}
