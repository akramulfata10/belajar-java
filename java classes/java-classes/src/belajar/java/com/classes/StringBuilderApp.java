package belajar.java.com.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
//String tanpa String builder
//        String name = "akramul";
//
//        name = name + " " + "fata";
//
//        System.out.println(name);
        //String builder

        StringBuilder builder = new StringBuilder();
        builder.append("akramul");
        builder.append("");
        builder.append("fata");
        System.out.println(builder);

    }
}
