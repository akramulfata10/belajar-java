package coding.java.now.application;

import coding.java.now.data.AnonymouseClass;

public class AnonymouseApp {

    public static void main(String[] args) {


    //anonymouse menginstall objek secara langsung

         AnonymouseClass english = new AnonymouseClass() {
            //wajib instansiasi method yang ada di parent interface nya

            public void sayHello(){
                System.out.println("hello");
            }

            public void sayHello2(String name){
                System.out.println("hello ini Adlaah " + name);
                }

        };

        english.sayHello();
        english.sayHello2("munira");
    }
}
