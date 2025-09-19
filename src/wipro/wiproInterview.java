package wipro;

import java.util.*;

public class wiproInterview {

    public static void main(String[] args) {

        int[] input = {2, 3, 4, 8, 7, 1, 2, 3, 6, 4};

        List<Integer> al = Arrays.stream(input).boxed().sorted(Comparator.naturalOrder()).toList();







        System.out.println(al);
        //-> output : [0,0,1,1,1]


        int[] list = {2, 3, 4, 8, 7, 1, 2, 3, 6, 4};

        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            ArrayList<Integer> dd = new ArrayList<>();
            for (int j = i; j < list.length-1; j++) {

                if (list[j] + 1 == list[j + 1] ) {
                    dd.add(list[i]);
                    dd.add(list[i + 1]);
                }

            }
            hashMap.put(i, dd);

        }
        System.out.println(hashMap);
    }
}