package com.company.Part_4_collection_set;

import java.util.*;

public class Main {

    public static void main (String[] args){

        List<String> list = new ArrayList<>();
        list.add("String1");
        list.add("String2");
        list.add("String3");

//        list.get(0);
//        list.remove(0);

        for (String item:list){
            System.out.println(item);
        }

//        Iterator<String>iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Set<String> set = new HashSet<>();
        set.add("stringset1");
        set.add("stringset1");
        set.add("stringset1");
        set.add("stringset2");
        set.add("stringset3");

//        Iterator<String>iterator1 = set.iterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }

        for (String s:set){
            System.out.println(s);
        }

//        set.remove("stringset1");
        System.out.println(set); // set хранит только уникальные значения
        System.out.println(set.contains("stringset3"));
        System.out.println(set.contains("stringset2343"));
    }
}
