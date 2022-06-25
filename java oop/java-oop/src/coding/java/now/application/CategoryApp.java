package coding.java.now.application;

import coding.java.now.data.*;

public class CategoryApp {
    public static void main(String[] args) {
        /**
         * dengan menggunakan teknik encapkulasi maka field yang ada di parent tidak bisa dirubah sembaranggan
         * tapi field yang ada di parent class harus Access Modifier private
         */
        Category cat = new Category();
        cat.setId("ID");
        //cat.id = null; //ini error karena ada setter dan getter field tidak sembarangan bisa di akses
        System.out.println(cat.getId());

    }
}
