package coding.java.now.exception;
//sebuah exception yang kita buat maka dia akan extends ke objek throwlable
public class ValidatonException extends Throwable{
    public ValidatonException(String message) {
        super(message);
    }
}
