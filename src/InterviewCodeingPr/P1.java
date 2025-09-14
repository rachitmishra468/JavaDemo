package InterviewCodeingPr;

//Array contains = {-ve and +ve}
//
//i,j
//        nums={1,2,3,-4,5,6,67,3,8,-9}
//
//Sudo code
//
//{1, -4, 2,-9, }
//
//
//output {1,-4, 2,-9 , 5 ,6,67,3,8 } in java


import java.util.ArrayList;

public class P1 {

    public static void main(String[] args) {
        Program1();

    }


    public static void Program1() {
        int[] input = {1, 2, 3, -4, 5, 6, 67, 3, 8, -9};
        ArrayList positive = new ArrayList();
        ArrayList negative = new ArrayList();
        ArrayList result = new ArrayList();



        for (int i : input) {
            if (i < 0) {
                negative.add(i);
            } else {
                positive.add(i);

            }
        }

        int p = 0;
        int q =0;
        for(int i : input){
            if(p<positive.size() && q<negative.size()){
                result.add(positive.get(p++));
                result.add(negative.get(q++));
            }
            else if(p<positive.size()){
                result.add(positive.get(p++));
            }
            else if(q<negative.size()){
                result.add(negative.get(q++));
            }


        }

        while (p<positive.size() && q<negative.size())
        {  result.add(positive.get(p++));
            result.add(negative.get(q++));

        }


        System.out.println(negative + "" + positive + "" + result);


    }

}
