package coding.java.now.application;

import coding.java.now.data.RecordClass;

public class RecordClassApp {
    public static void main(String[] args) {
        //cara instantsiasi class record app
        //otomatis method toString nya di generate jadi tidak usah di buat methodnya lagi
        RecordClass recordClass = new RecordClass("akramul", "fata");
        //akses setter dan getter record class
        System.out.println(recordClass.username());
        System.out.println(recordClass.Password());
        //println biasa untuk record class
        System.out.println(recordClass);

        //pemanggilan contraktor record class
        System.out.println(new RecordClass());
        System.out.println(new RecordClass("akramul"));
        System.out.println(new RecordClass("akramul","fata"));

    }
}
