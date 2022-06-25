package belajar.java.com.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String value = "akramul fata";

        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()){
            String name = tokenizer.nextToken();
            System.out.println(name);
        }
    }
}
