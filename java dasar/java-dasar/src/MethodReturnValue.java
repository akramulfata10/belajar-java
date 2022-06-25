public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(100,100);
        System.out.println(result);
        //pemanggilan method yang ada parameter secara singkat
        System.out.println(sum(200,200));
        System.out.println("menghitung percabanggan menggunakan method return value");
        System.out.println(hitung(100 ,"+",100));
        System.out.println(hitung(200 ,"-",100));
        System.out.println(hitung(100 ,"hitung",100));
    }
    static int sum(int angka1, int angka2){
        var value = angka1 + angka2;
        return value;
    }

    static int hitung(int angka1, String Operasi, int angka2){
        if(Operasi == "+"){
            return angka1 + angka2;
        } else if (Operasi == "-"){
            return angka1 - angka2;
        } else {
            return 0;
        }
    }
}
