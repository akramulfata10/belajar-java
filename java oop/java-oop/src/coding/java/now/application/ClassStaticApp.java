package coding.java.now.application;
//static import
import static coding.java.now.util.Country.*;

public class ClassStaticApp {
    public static void main(String[] args) {

        //cara pemanggilan inner class yang static
        InnerClass innerClass = new InnerClass();
        innerClass.setName("akramul fata");
        System.out.println(innerClass.getName());



    }
}
