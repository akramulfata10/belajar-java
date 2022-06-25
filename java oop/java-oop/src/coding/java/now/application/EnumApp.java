package coding.java.now.application;

import coding.java.now.annocation.Fancy;
import coding.java.now.data.Customer;
import coding.java.now.data.Enum;
@Fancy(name = "name", tags = {"munir","apit"})
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("akramul fata");
        customer.setLevel(Enum.LAKI);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

    }
}
