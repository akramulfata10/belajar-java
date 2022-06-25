package belajar.java.com.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer integer = 10;
        Long longValue = integer.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();
        String contoh = "100.10";
        Double contohInt = Double.valueOf(contoh);
        System.out.println(contohInt);
    }
}
