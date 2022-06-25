public class DoWhileLoop {
    public static void main(String[] args) {
    //menggecek apbila nilai nya salah
    //dilakukan perulanggan sekali aja
    //kalau kondisi nya false maka perulanggan nya berhenti
    var angka = 100;
    do{
        System.out.println("perulanggan ke-"+angka);
        angka++;
    }while(angka <= 10);
    }
}
