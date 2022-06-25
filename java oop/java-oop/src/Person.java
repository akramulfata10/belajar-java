import javax.xml.namespace.QName;

class Person {
    /**
     * didalam java variabel itu disebut dengan field atau atribut.
     * @param name,address,country adalah sebuah field/atribut kalau di java
     */
    String name;
    String address;
    final String country = "indonesia";


    /**
     * nama method constraktor harus sama dengan nama class nya
     * method constraktor akan dijalankan pertama kali pada saat objek dibuat
     * @param paramName
     * @param paramAddres
     * membuat tiga constraktor dengan parameter yang berbeda
     */
    //ini adalah cconstraktor dengan dua parameter shadowing
    /**
     * variabel shadowing memiliki nama variabel yang sama dengan field nya .
     * Person(String name,String address){
     * name = name;
     * address =address;
    }*/
    //mengatasi Variable Shadowing dengan cara menambahkan keyword This
    Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    //constraktor overloading nama method yang sama tapi parameternya berbeda
    Person(String ParamName){
    //memanggil constraktor lain dengan code this
        this(ParamName , null);
    }
    Person(){
        this(null);
    }

    /**
     *
     * @param name adalah variabel shadowing karena dia memiliki variabel yang sama di class/diluar constraktor
     * maka si variabel name ini dia hanya mamanggil variabel yang ada di dalam constraktor saja
     */
    void sayHello(String name){
        System.out.println("hello " + name + " my name is " + this.name);
    }
}
