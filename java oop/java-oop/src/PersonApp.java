public class PersonApp {
    public static void main(String[] args) {
        /*
        instansiasi objek di java
         */
        var person = new Person("akramul fata", "Lhoksemawe");
        /**
         * Instansiasi objek Person
         * @param name isi variabel name yang ada di class Person .
         * @param address isi variabel name yang ada di class Person.
         * @param country yang ada di class Person tidak bisa di ubah karena ada
         * kata kunci final
         */
        /**
         * pemanggilan atau mengakses atribut yang ada di Class Person
         */
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
        /**
         * pemanggilan method yang ada di class Person
         * menambahkan method didalam class
         */
        person.sayHello("munira");

        Person person3;
        person3 = new Person();
        person3.name = "joko";
        person3.sayHello("budi");
    }
}
