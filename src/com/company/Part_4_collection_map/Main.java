package com.company.Part_4_collection_map;

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

        Map<String,Integer> map = new HashMap<String, Integer>();

        map.put("key1",2);
        map.put("key2",5);
        map.put("key3",5);
        map.put("key4",7);

//        Integer key = map.get("key2");
//        System.out.println(key);
//        map.remove("key1");

        // Part_4_collection_map

        Set<String> strings = map.keySet();
        for (String k:strings){
            System.out.println(k);
        }

        for (Integer i: map.values()){
            System.out.println(i);
        }
    }
}
