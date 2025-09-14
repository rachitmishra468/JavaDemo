package Infosys;

import java.util.Arrays;

public class InfosysIn {
    public static void main(String[] args) {
     int[] al ={2,4,6,12,45,46,76,3,6,776,78,98,666 , 668 ,900};
     int secoundlargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;


     for(int num : al){
         if(largest<num){
                 secoundlargest = largest;
                 largest = num;
             } else if(secoundlargest<num && largest>num){
                 secoundlargest= num;
             }
     }

        System.out.println("secoundlargest "+secoundlargest);
    }
}
