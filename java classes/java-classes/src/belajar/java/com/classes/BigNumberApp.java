package belajar.java.com.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("10000000000000000000");
        BigInteger b = new BigInteger("200000000000000000000");
        //penambahan pada Bigintinger
        BigInteger hasil = a.add(b);
        System.out.println(hasil);

    }
}
