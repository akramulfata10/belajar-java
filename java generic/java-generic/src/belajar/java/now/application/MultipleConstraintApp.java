package belajar.java.now.application;

import java.util.StringTokenizer;

public class MultipleConstraintApp {
    public static void main(String[] args) {

    Data<VicaPresident> vicaPresidentData = new Data<>(new VicaPresident());
    // Data<Manager> managerData = new Data<>(new Manager()); // ERROR Manager tidak implement CanSayHello
    }
    public static interface CanSayHello{
        void sayHello(String name);
    }
    public static abstract class Employee{

    }
    public static class Manager extends Employee{

    }
    public static  class VicaPresident extends Employee implements CanSayHello{
        public void sayHello(String name){
            System.out.println("Hello " +name);
        }
    }

    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
