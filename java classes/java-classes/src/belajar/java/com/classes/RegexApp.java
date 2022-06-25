package belajar.java.com.classes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexApp {
    public static void main(String[] args) {
        //regular ini adalah fungsi untuk melakukan pencarian
        //yang bagus
        //regular exception ini ada di package package java.util.regex
        String name = "akramul fata";
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
