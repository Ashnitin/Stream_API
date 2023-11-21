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
        l1.add(7);
        l1.add(30);
        l1.add(5);
        System.out.println(l1);
            //Map Function
        List<Integer> l2=l1.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l2);
            //Filter sunction
        List<Integer>l3=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l3);
    }
}
