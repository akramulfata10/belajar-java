package belajar.java.now.util;

public class ArrayHelper {
    //generic method
    public static <T> int count(T... array) {
        return array.length;
    }
}
