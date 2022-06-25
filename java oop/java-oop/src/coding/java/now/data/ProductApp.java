package coding.java.now.data;

/**
 * access modifier (protected) hanya bisa di instantsiasi oleh class yang sama dan package yang sama.
 * acces modifier (private) hanya bisa digunakan oleh class itu sendiri.
 */
public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("mac book pro ",20000000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);
    }
}
