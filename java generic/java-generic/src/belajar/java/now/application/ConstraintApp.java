package belajar.java.now.application;

public class ConstraintApp {
    public static void main(String[] args) {
        //kalau parameter type nya extends ke type number
        //maka tidak bisa di instansiasi menjadi type String

        //instansiasi
        NumberData<Integer> numberData = new NumberData<>(1);
        //NumberData<String> stringNumberData = new NumberData<String>("error karena parameter type nya di khususkan buat number"); //Error
        NumberData<Long> longNumberData = new NumberData<>(1L);

        System.out.println(numberData);
        System.out.println(longNumberData);
    }

    public static  class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
