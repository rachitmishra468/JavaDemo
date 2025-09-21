package wissen;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WissenInterview {
    public static void main(String[] args) {

      var map   = new HashMap<String ,Integer>();

      //  HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple" ,  30);
        map.put("DDD", 50);
        map.put("Banana", 50);
        map.put("AAAA", 50);
        map.put("CCCC", 50);


        Map<String, Integer> sorted =   map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));



for(Map.Entry<String,Integer> entry :sorted.entrySet()){
    System.out.println(entry.getKey() +" ===  "+entry.getValue());
}



        String namet ="rachit mishra";// ti


       String p =  namet.chars().mapToObj(c->String.valueOf((char)c)).distinct().collect(Collectors.joining());

        System.out.println(p);

     namet.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()
        )).entrySet().stream().filter(m->m.getValue()>1).forEach(System.out::println);




        String[] strings = namet.split(" ");
        StringBuilder result = new StringBuilder();
        for (String name : strings) {

            char[] chars = name.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }

            String reversed = new String(chars);
            System.out.println(reversed);
            result.append(new String(chars)).append(" ");
        }
        System.out.println(result);

        int[] array = {0,1,0,1,0,1,0,0,0,0,};
        List<Integer>  al=  Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        System.out.println(al);


    }
}
