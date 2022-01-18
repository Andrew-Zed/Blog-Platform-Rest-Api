package com.example.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);
        numbers.forEach( (n) -> {
            System.out.println(n); } );
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        } ;
        for (Integer number : numbers) {
            method.accept(number);
        }

    }
}
