package belajar.java.com.classes;
import java.util.Arrays;
public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
           1,3,5,6,7,8,9,9,9,8,7,6,65,5,5,6,7,8,8,8
        };
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,3));
        System.out.println(Arrays.binarySearch(numbers, 234));
        System.out.println(Arrays.binarySearch(numbers, 100));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
