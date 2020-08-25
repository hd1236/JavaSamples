package com.hand.javasamples.DesignPatterns.action.Iteractor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tester {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(8);
        list.add(10);
        list.add(3);
        for(Integer i : list){
            System.out.println(i);
        }

        System.out.println("---");

        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            Integer i = iterator.next();
//            System.out.println(i);
//        }
        iterator.next();
        iterator.remove();
        Integer i = iterator.next();
        System.out.println(i);

        System.out.println("---");

        for(Integer j : list){
            System.out.println(j);
        }
    }
}
