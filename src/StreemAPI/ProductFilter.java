package StreemAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class  Produce{

    private String name;
    private int price;
    private String catogries;

    Produce(String name , int price , String catogries){
        this.name =name;
        this.price =price;
        this.catogries = catogries;
    }

    public String getCatogries(){
        return  catogries;
    }

    public String getName(){
        return  name;
    }

    public int getPrice() { return price; }

}

public class ProductFilter {

    public static void main(String[] args) {
        List<Produce> list = List.of( new Produce("rachit",100,"Name")
         , new Produce("Sanchit ",150,"Name")
                 , new Produce("Sanchit ",150,"Name")
                , new Produce("Sanchit ",150,"Name")
        ,  new Produce("Mishra ",100,"LastName "));


       List<Produce> ls=  list.stream().filter(s-> s.getCatogries().equalsIgnoreCase("Name"))
               .sorted(Comparator.comparing(Produce::getPrice))
               .toList();
       ls.stream().distinct().forEach(p-> System.out.println(p.getName()));
    }


}
