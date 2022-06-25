package coding.java.now.data;

public class Avanza implements Car{
    //wajib di implentasikan ke class chile nya method yang ada di parentnya
    public void merekMobil(){
        System.out.println("Avanza");
    }
    public int kecepatan(){
        return 4;
    }

    public String getBrand(){
        return "Toyota";
    }

    public boolean isMaintenace(){
        return false;
    }
}
