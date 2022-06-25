package coding.java.now.stacktracetlement;

public class StackTraceElement {

    public static void main(String[] args) {
        //karena stack ini fungsi yang di exception jadi kita harus membuat program nya ke dalam try catch

        try {
            String[] names = {
                "fata","rajul","munira"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable){
            //apabila ada error tampilkan error nya di baris berapa
            java.lang.StackTraceElement[] stackTrace = throwable.getStackTrace();
            throwable.printStackTrace();
        }
    }

}
