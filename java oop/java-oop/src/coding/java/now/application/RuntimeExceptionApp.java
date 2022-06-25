package coding.java.now.application;

import coding.java.now.exception.BlankException;
import coding.java.now.request.LoginRequest;
import coding.java.now.util.RuntimeUtil;

public class RuntimeExceptionApp {
    public static void main(String[] args) {


        LoginRequest loginRequest = new LoginRequest(null,"fata");
        RuntimeUtil.validateRuntime(loginRequest);// terjadi error



    }
}
