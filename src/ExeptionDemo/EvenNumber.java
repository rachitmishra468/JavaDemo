package ExeptionDemo;

import java.util.stream.IntStream;

public class EvenNumber {

    public static void main(String[] args) {
        findEvenNumber();
    }

    private static void findEvenNumber(){
        IntStream.rangeClosed(1,100).filter(n->n%n==0).forEach(System.out::println);
    }
}
