package coding.java.now.application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResorceApp {
    public static void main(String[] args) {
        try(BufferedReader file = new BufferedReader(new FileReader("file.md"))){
            while (true){
                String text = file.readLine();
                if (text == null){
                    break;
                }
                System.out.println(text);
            }
            System.out.println("Program selesai Dibuka");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
