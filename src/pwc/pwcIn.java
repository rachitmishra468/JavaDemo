package pwc;


import java.util.*;

public class pwcIn {

    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int target = 6;
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < al.size(); i++) { //0
            ArrayList<Integer> alt = new ArrayList<>(); //new
            int count = 0;
            for (int j = i; j < al.size(); j++) { // 0
                count = count + al.get(j);
                alt.add(al.get(j));
                if (count == target) {
                    hashMap.put(i, alt);
                    break;
                }}}

        for (Map.Entry<Integer, ArrayList<Integer>> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue());
        }


    }


}
