public class MethodOverloading {
    public static void main(String[] args) {
        //nama method nya boleh sama asal jangan prameter nya yang sama
        sayHello();
        sayHello("akramul");
        sayHello("akramul", "fata");
    }

    static void sayHello(){
        System.out.println("hello");
    }

    static void sayHello(String firstname){
        System.out.println("hello" +firstname);
    }

    static void sayHello(String name, String lengkap){
        System.out.println("hello" + name + " " + lengkap);
    }
}
