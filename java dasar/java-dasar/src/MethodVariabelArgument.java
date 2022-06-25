public class MethodVariabelArgument {
    public static void main(String[] args) {
        //kalau tidak pakek method argument maka kita harus buat lagi variabel untuk menampung nilainya
        //kemudian nilai tersebut akan dikirim melalui method parameter variabel argument
        int[] values = {80, 50, 50, 50, 80};
        sayCongrats("Eko", values);
        sayCongrats("Budi", 0, 20, 36, 50);

    }
    static void sayCongrats(String name, int... values) {
        //disini saya mau cari nilai rata-ratanya
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
