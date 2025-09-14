package IBMMergeSortedArrays;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9};
        int[] arr2 = {2,4,6,7,8,22,44};
        sortedArray(arr ,arr2);

       List<Integer> al = Stream.concat(Arrays.stream(arr).boxed() , Arrays.stream(arr2).boxed()).sorted().toList();
       System.out.println("0000 ==== "+al);

    }

    private static void sortedArray(int [] arr1 ,int [] arr2){
        int i =0 ;
        int j = 0;
        int k =0;
        int [] result = new int[arr1.length+arr2.length];

        while (i<arr1.length && j<arr2.length){

            if(arr1[i]<=arr2[j]){
                result[k++] = arr1[i++];
            }
            else {
                result[k++] = arr2[j++];
            }


        }

        while (i< arr1.length){
            result[k++] =arr1[i++];
        }

        while (j< arr2.length){
            result[k++] = arr2[j++];
        }

System.out.println(Arrays.toString(result));
    }
}
