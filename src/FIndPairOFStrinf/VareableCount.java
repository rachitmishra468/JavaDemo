package FIndPairOFStrinf;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VareableCount {
    public static void main(String[] args) {
        interviewP1("Rachitmishra");
    }


    public static void interviewP1(String name){
        Map<Character,String> hm = new ConcurrentHashMap<>();
        for(int i =0 ; i<=name.length()-1; i++){
            if(hm.containsKey(name.charAt(i))){
                int count = Integer.parseInt(hm.get(name.charAt(i)).toString()) +1;
                System.out.println("variable  "+ name.charAt(i) +" count "+count);
                hm.put(name.charAt(i) , String.valueOf(count));
            }else {

                hm.put(name.charAt(i) ,"1");
            }
        }

        System.out.println("HashMap Size "+hm);

       for(Map.Entry<Character , String > entry : hm.entrySet()){
           System.out.println(entry.getKey() +" vale is "+entry.getValue());
       }


      name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(System.out::println);

    }
}
