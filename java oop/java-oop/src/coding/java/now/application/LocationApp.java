package coding.java.now.application;
import coding.java.now.data.*; //mengimport semua class yang ada di package data


public class LocationApp {
    public static void main(String[] args) {
        //var location = new Location(); ini tidak bisa di instansiasi karena dia mamanggil class abstract
        //var loc = new Locatiaon(); error tidak bisa di instantsiasi
        var city = new City();
        city.name = "zakarta";
        System.out.println(city.name);
    }
}
