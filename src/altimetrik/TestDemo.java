package altimetrik;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        collectStr();
    }

    private static void collectStr(){
        String[] inputStr= {"cba", "omn", "mno", "bac", "abc", "atbc"};

        Map<String , List<String>> map = new HashMap<>();

        for(String string :inputStr){
            char [] chars = string.toCharArray();//cba
            Arrays.sort(chars); // abc
            String key = new String(chars); //abc
            if(map.containsKey(key)){
                List<String> s = map.get(key);
                s.add(string);
                map.put(key , s);
            }else {
                List<String> s = new ArrayList<>();
                s.add(string);
                map.put(key , s);

            }

        }

        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);

    }
}



/*
2. Java Coding
Group them together in Output format. Note: Please consider dynamic inputs and growable//
String[] inputStr= {"cba", "omn", "mno", "bac", "abc", "atbc"};
//{[cba, bac, abc], [omn, mno],[atbc]}*/
