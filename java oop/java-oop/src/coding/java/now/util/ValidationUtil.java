package coding.java.now.util;

import coding.java.now.annocation.NotBlank;
import coding.java.now.exception.BlankException;
import coding.java.now.exception.ValidatonException;
import coding.java.now.request.*;

import java.lang.reflect.Field;

public class ValidationUtil {
    //buat satu record class untuk menampung data dari login
    public static void Validate(LoginRequest loginRequest) throws ValidatonException, NullPointerException{
        if(loginRequest.username() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()){
            throw new ValidatonException("username tidak boleh kosong");
        } else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()){
            throw new ValidatonException("password tidak boleh kosong");
        }
    }

    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                // validated
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank ");
                    }

                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }

        }
    }

}
