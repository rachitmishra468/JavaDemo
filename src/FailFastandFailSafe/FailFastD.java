package FailFastandFailSafe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastD {
    public static void main(String[] args) {
        failfast();
        failSafe();
    }

    public static void failfast(){
        HashMap hm = new HashMap<String ,String>();
        hm.put("rachit" ,"Mishra");
        hm.put("Sanchit" , "Mishra");
        Iterator iterator = hm.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next().toString();
            System.out.println(key +" last name os " +hm.get(key));
           // hm.put("Charu ","Mishra"); //ConcurrentModificationException
        }
    }


    public static void failSafe(){
        ConcurrentHashMap hm = new ConcurrentHashMap<String ,String>();
        hm.put("rachit" ,"Mishra");
        hm.put("Sanchit" , "Mishra");
        Iterator iterator = hm.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next().toString();
            System.out.println(key +" last name os " +hm.get(key));
             hm.put("Charu ","Mishra"); //ConcurrentModificationException
        }
    }

}
