package coding.java.now.application;

import coding.java.now.request.CreateUserRequest;
import coding.java.now.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("akramul fata");
        request.setPassword("munir");
        System.out.println("login berhasil");
        ValidationUtil.validationReflection(request);

    }
}
