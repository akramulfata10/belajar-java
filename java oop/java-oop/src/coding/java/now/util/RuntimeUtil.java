package coding.java.now.util;

import coding.java.now.exception.BlankException;
import coding.java.now.request.LoginRequest;

public class RuntimeUtil {
    public static void validateRuntime (LoginRequest loginRequest) {
        if(loginRequest.username() == null ){
            throw new BlankException("username is null");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("username tidak boleh kosong");
        } else if (loginRequest.password() == null ){
            throw new BlankException("password is null");
        } else if (loginRequest.password().isBlank()){
            throw new BlankException("password tidak boleh kosong");
        }
    }
}
