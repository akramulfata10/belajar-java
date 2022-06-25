public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("fata");
        employee.sayHello("akramulfata");

        employee  = new Manager("rajul");
        employee.sayHello("munira");

        employee  = new VicePresident("apit");
        employee.sayHello("dal randi");

        //acces method polymorphism
        getEmployee(new Employee("manda"));
        getEmployee(new Manager("aidil"));
        getEmployee(new VicePresident("nurul"));
    }
    static void getEmployee(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("hello Vp " + employee.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("hello Manager " + employee.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
