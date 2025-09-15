package GlobaleLogic;

import java.util.*;
import java.util.stream.Collectors;

public class GLInterview {
    public static void main(String[] args) {

        int [] al ={2,7,11,3,15,6};
        int target =9;


        System.out.println(findPairst(al,target));


    }



    public static List<List<Integer>> findPairs(int[] nums, int target) {
       List<List<Integer>> list= new ArrayList<>();
       Set<Integer> hashSet = new HashSet<>();
       for (int num: nums){
           int complement = target-num;
           if(hashSet.contains(complement)){
               list.add(Arrays.asList(complement,num));
           }
           hashSet.add(num);
       }
       return list;
    }



    public static List<List<Integer>> findPairst(int[] nums, int target) {
      Set<Integer> seen = new HashSet<>();

      return Arrays.stream(nums).mapToObj(num->{
          int v= target-num;
          if(seen.contains(v)){
              return Arrays.asList(num, v);
          }
          seen.add(num);
          return null;

      }).filter(Objects::nonNull).collect(Collectors.toList());
    }
}
