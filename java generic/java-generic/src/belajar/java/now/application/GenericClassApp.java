package belajar.java.now.application;

import belajar.java.now.MyData;

public class GenericClassApp {
    public static void main(String[] args) {


        MyData<String> stringMyData = new MyData<>("eko");
        MyData<Integer> integerMyData = new MyData<>(10);
        var MyDataBoolean = new MyData<Boolean>(true);

        String string = stringMyData.getData();
        Integer integer= integerMyData.getData();
        Boolean data = MyDataBoolean.getData();

        System.out.println(string);
        System.out.println(integer);
        System.out.println(data);

    }
}
