package com.bridglabz;

import java.util.ArrayList;
import java.util.List;

public class StreamOperation {
    public static void main(String[] args) {
        List <String> l= new ArrayList<String>();
        l.add("Ashwini");
        l.add("Rucha");
        l.add("Pooja");
        l.stream().forEach(System.out::println);
    }
}
