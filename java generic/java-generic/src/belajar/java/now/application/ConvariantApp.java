package belajar.java.now.application;

import belajar.java.now.MyData;

public class ConvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("fata");

        proses(stringMyData);
        MyData<? extends Object> myData = stringMyData;
    }
    public static void proses(MyData<? extends Object> myData){
        System.out.println(myData.getData());
        //myData.setData("munir"); //tidak boleh, karena berbahaya

    }
}
