public class TipeDataArray {
    public static void main(String[] args) {

    String[] tipeDataArray;
    //instansiasi array
    tipeDataArray = new String[3];
    tipeDataArray[0] = "akramul fata";
    tipeDataArray[1] = "rajul";
    tipeDataArray[2] = "affit";

    System.out.println(tipeDataArray[0]);

    tipeDataArray[0] = "fata";
    System.out.println(tipeDataArray[0]);
    //pembuatan variabel array secara singkat
    String[] stringArray2 = new String[3];
    stringArray2 [0]= "sanggat mudah";
    stringArray2 [1]= "belajar java";
    stringArray2 [2]= "sama dengan belajar php";

    System.out.println(stringArray2[0]);
    System.out.println(stringArray2[1]);
    System.out.println(stringArray2[2]);
    //ubah data array
    stringArray2[0] = "munira";
    System.out.println(stringArray2[0]);
    //penulisan array yang singkat

        String[] arraySingkat = {
            "nomor","hp","fata"
        };

        System.out.println(arraySingkat[0]);

        int[] arrayNomor = {
           1,2,3,4,5
        };

        System.out.println(arrayNomor[4]);

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        //array multidimensi
        String[][] arrayMultidimensi = {
                {"akramu","fata"},
                {"rajul","munira"},
                {"affit","dal"},
        };


        System.out.println(arrayMultidimensi[0][1]);
        System.out.println(arrayMultidimensi[1][0]);
        System.out.println(arrayMultidimensi[2][1]);
    }
}
