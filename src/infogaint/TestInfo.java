package infogaint;

import java.util.*;

public class TestInfo {

    public static void main(String[] args) {

  List<String> l = List.of("eat","tea","tan","ate","nat","bat");
        HashMap<String , ArrayList> hm = new HashMap<>();



for(String s :l){
     char[] chars =s.toCharArray();// char[] chars = s.toCharArray();//
    Arrays.sort(chars);
    String str = new String(chars);

  if(hm.containsKey(str)){
      ArrayList list = hm.get(str);
      list.add(s);
      hm.put(str , list);

  }
  else {
      ArrayList<String> list = new ArrayList<>();
      list.add(s);
      hm.put(str ,list);

  }





}

for(Map.Entry<String,ArrayList> entry:hm.entrySet()){

    System.out.print(entry.getValue());
}


    }



  //  Input: ["eat","tea","tan","ate","nat","bat"]
  //  Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
}
