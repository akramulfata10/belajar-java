public class Break {
    public static void main(String[] args) {


        var angka = 1;

        while (true){
            System.out.println("perulangakan ke-"+angka);
            angka++;


            if(angka > 10 ) {
                break;
            }
        }
        System.out.println("perulanggan berhenti");
    }
}
