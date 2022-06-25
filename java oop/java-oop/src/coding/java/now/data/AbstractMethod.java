package coding.java.now.data;

public abstract class AbstractMethod {
    //method abstract
    public String name;
    /**
     * @method abstract void run tidak bisa di deklarasikan atau pun di set nilainya
     * kalau kita membuat method abstract di parent nya maka di chile nya kita wajib membuat method abstract nya
     * dan harus mendeklarasikan/set nilai nya .
     */
    public abstract void run();
}
