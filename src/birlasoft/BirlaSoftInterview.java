package birlasoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



@FunctionalInterface
interface A{

    void sum(int t);

    default void test(){
        System.out.println("default run");
    }
}

public class BirlaSoftInterview {

    public static void main(String[] args) {


        A a = (int p)->{
            System.out.println("test lamda "+p*p);
        };

        a.sum(5);
        a.test();



        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2,5,6,7,8,9));
        Iterator iterator = al.iterator();
        while (iterator.hasNext()){
            Integer val = (Integer) iterator.next();
            System.out.println(val);
            if(val==6){
                iterator.remove();
            }
        }

        al.remove(2);
        System.out.println(al);
    }
}
