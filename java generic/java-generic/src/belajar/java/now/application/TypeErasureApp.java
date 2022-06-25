package belajar.java.now.application;

import belajar.java.now.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("akramul fata");
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }

}
