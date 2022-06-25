package coding.java.now.application;

import coding.java.now.annocation.Fancy;
import coding.java.now.exception.DatabaseError;

public class DatabaseApp {
    @Fancy(name = "name", tags = {"munir","apit"})
    public static void main(String[] args) {

        //panggil method koneksi nya
        //ini contoh kasus dari error sangat di rekomendasikan untuk kasus ini
        connectDatabase("fata", "fata");

    }
    @Fancy(name = "name", tags = {"munir","apit"})
    public static void connectDatabase(String username, String password){

        if(username == null || password == null){
            throw new DatabaseError("tidak koneksi ke database");
        } else {
            System.out.println("koneksi berhasil");
        }
    }
}
