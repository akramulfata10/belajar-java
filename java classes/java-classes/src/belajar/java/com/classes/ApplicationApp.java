package belajar.java.com.classes;
import java.io.*;
import java.util.Properties;
public class ApplicationApp {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");
            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException exception){
            System.out.println("file tidak ditemukan");
        } catch (IOException exception){
            System.out.println("file gagal di panggil");
        }


        try{
            Properties tambah = new Properties();
            tambah.put("name.firstname","akramul");
            tambah.put("name.lastname","fata");
            //tambah kan ke nilai ke file
            tambah.store(new FileOutputStream("name.properties"),"Konfigurasi Name");
        } catch (FileNotFoundException exception){
            System.out.println("error gagal membuat file");
        } catch (IOException exception){
            System.out.println("error menyimpan file");
        }

    }
}
