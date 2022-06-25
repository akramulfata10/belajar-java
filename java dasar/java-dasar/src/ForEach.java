public class ForEach {
    public static void main(String[] args) {
        String[] categories = {
          "rajul","fata","munir","akramul","affit"
        };

        for(int i = 0; i < categories.length; i++){
            System.out.println(categories[i]);
        }
        System.out.println("menggunakan foreach");
        for (var value :categories){
            System.out.println(value);
        }
    }
}
