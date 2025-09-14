package Streem_Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        resucecall();
    }
private static void resucecall(){
    List<String> chart = Arrays.asList("hgfjhgffj", "cfgc","hgcfgudgdg","hvhgcftdt","vhgcch");
    Optional<String> fk= chart.stream().reduce((word1, wprd2)-> word1.length()>wprd2.length() ? word1:wprd2);
    fk.ifPresent(System.out::println);

}


}


