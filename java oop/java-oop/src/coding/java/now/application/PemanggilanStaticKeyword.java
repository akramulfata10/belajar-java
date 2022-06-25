package coding.java.now.application;
//static import
import static coding.java.now.data.ConstantStatic.*;
import static coding.java.now.data.StaticMethod.*;
import static coding.java.now.util.StaticBlock.*;

public class PemanggilanStaticKeyword {
    public static void main(String[] args) {

        System.out.println(APPLICATION); //acces keyword static di field.
        //dengan cara memanggil class nya kemudian nama method atau nama field static nya
        System.out.println(VERSION); //acces keyword static di field


        System.out.println(PROCESSOR); //acces Static block

        System.out.println(sum(1,4,5,6,7,8,9,5,8,9,9,8,7)); //acces method static



    }
}
