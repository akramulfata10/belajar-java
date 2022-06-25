package belajar.java.com.classes;

import java.util.Base64;

public class Base64App {

    public static void main(String[] args) {

        String name = "akramul fata";
        //buat satu variabel untuk menampung nilai yang kita encode
        String encode = Base64.getEncoder().encodeToString(name.getBytes());
        //variabel encode ini untuk panggil si class encode nya kemudian
        //ambil encode nya .kemudian conversi encode nya menjadi string
        //kemudian ambil encodenya .
        System.out.println(encode);


        byte[] bytes = Base64.getDecoder().decode(encode);
        //hapus Base 64 nya denagn cara menggunakan method getDecoder
        //decode nama variabel nya
        String result = new String(bytes);
        System.out.println(result);





    }

}
