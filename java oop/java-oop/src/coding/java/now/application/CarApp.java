package coding.java.now.application;

import coding.java.now.data.Avanza;
import coding.java.now.data.Bus;
import coding.java.now.data.Car;

public class CarApp {
    public static void main(String[] args) {
        //tidak bisa instansiasi class car nya karena dia parent interfaces sama seperti kayak class abstract juga
        Car car = new Avanza();
        System.out.println(car.kecepatan());
        car.merekMobil();

        car = new Bus();
        System.out.println(car.kecepatan());
        car.merekMobil();
    }
}
