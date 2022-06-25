package belajar.java.now.application;

import belajar.java.now.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("fata");
        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;
        procces(objectMyData);
        System.out.println(objectMyData.getData());
    }
    public static void procces(MyData<Object> myData){
        Object value = myData.getData();
        System.out.println("procces parameter " +value);
        myData.setData("akramul fata");
    }

}
