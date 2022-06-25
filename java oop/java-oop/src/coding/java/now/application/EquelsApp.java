package coding.java.now.application;

public class EquelsApp {
    public static void main(String[] args) {
        String first = "Eko";

        first = first + " "+ "Khanedy";

        String second = "Eko Khanedy";

        System.out.println(first == second); //false

        System.out.println(first.equals(second)); //true
    }


}
