package belajar.java.now.application;

import belajar.java.now.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"akramul","fata","munir"};
        Integer[] numbers = {0,1,2,3,4,5};

        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );

    }
}
