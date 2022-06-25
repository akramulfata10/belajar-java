package coding.java.now.application;

import coding.java.now.exception.ValidatonException;
import coding.java.now.request.LoginRequest;
import coding.java.now.util.ValidationUtil;

public class ExceptionApp {

    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("","fata");

        try {
            ValidationUtil.Validate(loginRequest);
            System.out.println("program dijalankan yang di try");
            //kalau terjadi error maka try ini dijalankan tidak akan di panggil
        } catch (ValidatonException exception){
            System.out.println("terjadi error dengan pesan : " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("data ini : " + exception.getMessage());
        } finally {
            //dia tidak peduli program berhasil dijalankan atau tidak
            //tetap dia di jalankan
            System.out.println("data sudah berhasil di proses");
        }
    }
}
