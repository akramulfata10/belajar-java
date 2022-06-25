public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 71;
        String ucapkan = nilai >= 75 ? "anda lulus" : "Harap Coba Lagi";
        System.out.println(ucapkan);

        var nilai1 = 80;
        String menggabungkanKondisi = nilai >=70 && nilai1 >= 80 ? "Anda Lulus" : "Anda Tidak Lulus";
        System.out.println(menggabungkanKondisi);
    }
}
