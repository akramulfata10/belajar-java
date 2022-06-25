package belajar.java.now.application;

import belajar.java.now.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("fata");

        //doIt(stringMyData);// Error karena invariant tidak bisa disubtitusi chile parentnya
        MyData<Object> objectMyData = new MyData<Object>(1000);
        // MyData<Integer> integerMyData = new objectMyData; // Error
        //doItInteger(objectMyData); //Error
    }
    public static void doIt(MyData<Object> objectMyData){
        //do nothing
    }
    public static void doItInteger(MyData<Integer> integerMyData){
        //do nothing
    }
}
