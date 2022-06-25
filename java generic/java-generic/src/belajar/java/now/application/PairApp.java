package belajar.java.now.application;

import belajar.java.now.Pair;

public class PairApp {

    public static void main(String[] args) {

        //multiple generic
        Pair<String, Integer> pair = new Pair<>("Eko" ,10);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }

}
