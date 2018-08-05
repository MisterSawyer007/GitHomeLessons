package com.company.Part_4_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main (String[] args){

        List <Integer> list = new ArrayList();

        list.add(12); //индекс 0
        list.add(13); //1
        list.add(14); //2
        list.add(15); //3


        list.remove(0); // после удаления элемента[] происходит смещение индексов
        //System.out.println(list.get(3)); //т.к произошло смещение, такого индекса нет - будет ошибка!


        for (int n: list){
            System.out.println(n);
        }

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        boolean empty = list.isEmpty();
        System.out.println(empty);
    }
}
