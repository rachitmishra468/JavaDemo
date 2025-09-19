package saksoft;

import java.util.*;

public class SaksoftInterview {
    public static void main(String[] args) {




       // Problem: Nearest Greater Element to the Right
      //  Given an array of integers, for each element, find the nearest greater element to its right. If there is no greater element, return -1 for that position.

     //   Input: arr = [4, 5, 2, 10, 8]

       // Output:[5, 10, 10, -1, -1]



        int[]  arr ={4,5,2,10,8};


        System.out.println(Arrays.toString(findtwo(arr)));

        System.out.println(Arrays.toString(find(arr)));





       // Input: nums = [2, 7, 11, 3, 15, 6],

       // target = 9
       // Output: [{2, 7},{3,6}]

        int[] input ={2, 7, 11, 3, 15, 6};
        int  target = 9;
       // System.out.println(findList(input , target));
    }

    public static List<List<Integer>> findList(int [] nums , int tatget){

        List<List<Integer>> al = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
             int complement = tatget - i; //

             if(set.contains(complement)){
                 al.add(Arrays.asList(complement , i)); //
             }
             set.add(i);

        }

        return al;
    }



    public static int[] find(int[] array){
        int n = array.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i= n-1 ;i>=0 ; i--){ //i=4

            while(!stack.isEmpty()&&stack.peek()<=array[i]){ // 8
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] =-1;  // [0,0,0,-1,-1]
            }else {
                result[i] = stack.peek();
            }
            stack.push(array[i]); //[10]
        }
        return result;
    }





public static int[] findtwo(int[] nub){
        int n = nub.length;
        int [] result = new int[n];

        for(int i =0; i<n; i++){
             int p = nub[i];
            result[i] = -1;
            for(int j=i+1 ;j<n ; j++){
                 if(p<nub[j]){
                     result[i] = nub[j];
                     break;
                 }}}
        return result;
}





}
