package belajar.java.com.classes;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //java.util.scanner adalah sebuah class yang ada
        //di java untuk membuat tampilan lebih mudah
        //lebih interaksi user
        Scanner scanner = new Scanner(System.in);
        System.out.print("nama :");
        String name = scanner.nextLine();

        System.out.println("hello nama saya " + name);
    }
}
