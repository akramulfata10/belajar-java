package coding.java.now.data;

import coding.java.now.annocation.Fancy;

@Fancy(name = "name", tags = {"munir","apit"})
public interface Car extends HasBrand,IsMaintenace{
    void merekMobil();

    int kecepatan();

    default boolean methodDefault(){
        //method ini harus di deklarasikan
        //kalau method default yang ada di interfaces bisa di implement di class chile / sunah di deklarasikan
        return false;
    }
}
