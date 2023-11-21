package com.bridglabz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {
    public static void main(String[] args) {
        List <String> l= new ArrayList<String>();
        l.add("Ashwini");
        l.add("Rucha");
        l.add("Pooja");
        l.stream().forEach(System.out::println);

        List<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println(l1);
        List<Integer> l2=l1.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l2);
    }
}
