package StreemAPI;

import java.util.List;
import java.util.Optional;

public class SumofevenNumber {
    public static void main(String[] args) {
        sunEvenNumber();
    }
    private static void sunEvenNumber(){
        List<Integer> list = List.of(2,4,6,3,6,7,66,88,90,76);
        Optional<Integer> fk = list.stream().filter(n->n%2==0).reduce(Integer::sum);
        System.out.println(fk);
    }
}
