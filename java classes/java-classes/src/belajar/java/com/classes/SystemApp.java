package belajar.java.com.classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        //method system.currentTimeMillis() untuk mengambil waktu dalam bentuk milisecond
        System.out.println(System.nanoTime());
        //method system.nanoTime() untuk mengambil waktu dalam bentuk milisecond
        System.out.println(System.getenv("App"));
        System.gc();
        System.exit(1);
        System.out.println("Hi");
    }

}
