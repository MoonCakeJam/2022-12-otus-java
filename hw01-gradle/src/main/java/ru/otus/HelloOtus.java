package ru.otus;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class HelloOtus {
    public static void main(String[] args) {
        Multiset<String> counts = HashMultiset.create();

        for (String arg : args) {
            counts.add(arg.toLowerCase());
        }

        System.out.println(counts);
    }
}