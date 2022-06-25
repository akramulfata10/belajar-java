public class Manager extends Employee{

    String company;
    Manager(String name){
        super(name);
    }

    Manager(String name,String company){
        super(name);
        this.company = company;
    }
    /**
     * super constraktor apabila di parent nya ada constraktornya ada constraktor maka di
     * chile class nya harus memanggil juga method yang ada di parent nya dengan perintah
     * super.constraktor
     * kalau constraktor nya tanpa menggirimkan parameter maka di class chile nya tidak wajib meng akses
     * constraktor yang ada di parent nya
     */
    /**
     *
     * @sayHello adalah method overriding yang bisa digunakan kembali oleh turunan nya .
     */
    void sayHello(String name){
        System.out.println("hello " + name + ", my name is Manager " + super.name);
    }
}
