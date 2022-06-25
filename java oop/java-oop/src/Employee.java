class Employee {

    String name;

    //Constraktor
    Employee(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("hello " + name + ", my name is Employee " + this.name);
    }
}
