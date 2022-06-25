public class VicePresident extends Manager{
    VicePresident(String name){
        //mengakses constraktor yang ada di parent class
        super(name);
    }
    /**
     * pemanggilan constraktor yang ada di parent nya
     * dengan kata kunci super
     */

    /**
     * @sayHello adalah method overriding yang bisa dipakai oleh class turunan nya
     */
    void sayHello(String name){
        System.out.println("hello " + name + ", my name is Vp " + super.name);
    }
}
