package ALT;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employes {
    String name ;

    Long salay ;

    Employes(String name , Long salay){
        this.name =name;
        this.salay =salay;
    }



    public Long getSalay() {
        return salay;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+" - "+salay;
    }
}

public class AltInterview {

    public static void main(String[] args) {

        List<Integer> liste = Arrays.asList(1,3,4,6,7);
        ArrayList<Integer> p = new ArrayList<>(Arrays.asList(1,3,4));//Arrays.asList(1,3,4,6,7);

        List<Employes> list = List.of(new Employes("it" ,1000L) ,new Employes("HR" ,40000L) ,
                new Employes("Admin" ,50000L));

        Optional<Employes> highestPaid = list.stream()
                .reduce((e1, e2) -> e1.salay > e2.salay ? e1 : e2);

        highestPaid.ifPresent(System.out::println);


    }
}
