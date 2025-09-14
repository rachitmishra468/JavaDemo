package PrintEvenNumberP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class PrintEvenNumberStreem {

    public static void main(String[] args) {
        normalevenNumber();

    }


    public static void normalevenNumber() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {

            al.add(i);

        }
        al.stream().filter(n -> (n % 2 != 0)).map(n -> n * 2).forEach(
                System.out::println
        );

        al.stream().filter(n -> (n % 2 == 0)).map(n -> "Number " + n * 2).sorted().forEach(System.out::println);

       int p=  al.stream().reduce(0, (a,b)->a+b);

        int c=  al.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y ? x:y);

System.out.println("Total "+p);
        System.out.println("Total c "+p);
    }


    private static int sau(int a, int b) {
        return a + b;
    }



}
