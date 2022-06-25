package belajar.java.com.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Akramul Fata";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        //huruf kecil semua
        System.out.println(name.toUpperCase());
        //huruf besar semua
        System.out.println(name.length());
        //panjang string
        System.out.println(name.startsWith("Akramul"));
        System.out.println(name.endsWith("Fata"));

        String[] names = name.split(" ");
        for (var value: names){
            System.out.println(value);
        }
        //memotong string berdasarkan spasi

        System.out.println(" ".isBlank());
        //apakah nilainya null
        System.out.println(" ".isEmpty());
        //apakah nilainya kosong
        System.out.println("".isEmpty());
        //apakah nilainya kosong
        System.out.println(name.charAt(0));
        //menggambil carakter yang ke 0


        char[] chars = name.toCharArray();


    }
}
