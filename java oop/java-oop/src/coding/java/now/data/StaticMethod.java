package coding.java.now.data;

public class StaticMethod {
    //method static
    public static int sum(int ... values){
        int total = 0;

        for(var value : values){
            total += value;
        }
        return total;
    }
}
