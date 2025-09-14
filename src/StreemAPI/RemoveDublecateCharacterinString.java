package StreemAPI;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDublecateCharacterinString {
    public static void main(String[] args) {
        removeM("RachitMishra");

    }

    private static void removeM(String str){
        String name = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.toCollection(LinkedHashSet::new)).stream()
                .map(String ::valueOf).collect(Collectors.joining());

        System.out.println(name);

    }
}
