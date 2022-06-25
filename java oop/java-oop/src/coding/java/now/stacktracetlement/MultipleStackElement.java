package coding.java.now.stacktracetlement;

public class MultipleStackElement {
    public static void main(String[] args) {

        try {
            simpelError();
        } catch (RuntimeException exception){
            //apabila ada error tampilkan error nya di baris berapa
            exception.printStackTrace();
        }
    }

    public static void simpelError() {
        try {
            String[] names = {
                    "fata","rajul","munira"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable){
            //apabila ada error tampilkan error nya di baris berapa
           throw new RuntimeException(throwable);
        }
    }
}
