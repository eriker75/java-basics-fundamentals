package org.eribert.collections.set;

import java.util.*;
import java.util.ArrayList;

public class HashSetExample {

    public static void example(){
        Set<String> hs = new HashSet<>();

        System.out.println(hs.add("uno"));
        hs.add("dos");
        hs.remove("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("five");
        System.out.println(hs.getClass());
        System.out.println(hs);

        // We can sort a set using an array list
        List<String> list = new ArrayList<>(hs);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void duplicated(String[] elements){

        Set<String> uniques = new HashSet<>();
        Set<String> duplicated = new HashSet<>();
        for(String el: elements){
            if(!uniques.add(el)){
                duplicated.add(el);
            }
        }
        uniques.removeAll(duplicated);

        System.out.println(Arrays.toString(elements));
        System.out.println(duplicated.size() + " elements duplicated: " + duplicated);
        System.out.println(uniques.size() + " elements not duplicated: " + uniques);
    }
}
