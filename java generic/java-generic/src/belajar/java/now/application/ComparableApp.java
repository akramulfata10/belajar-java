package belajar.java.now.application;
import belajar.java.now.Person;
import java.util.Arrays;
public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Eko", "Indonesia"),
                new Person("Budi", "Indonesia"),
                new Person("Joko", "Indonesia")
        };
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
