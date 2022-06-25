package coding.java.now.application;
import coding.java.now.data.*; //import class secara keseluruhan
import coding.java.now.data.Product;
public class Application {
    public static void main(String[] args) {
        Product product = new Product("hp",8000000);
        //System.out.println(product.name); ini error karena field di class nya di set sebagai protected.
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
