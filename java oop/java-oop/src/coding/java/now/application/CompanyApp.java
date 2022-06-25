package coding.java.now.application;

import coding.java.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("belajar java oop");


        Company.Employee1 employee1 = company.new Employee1();
        employee1.setName("akramul fata");


        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());

    }
}
