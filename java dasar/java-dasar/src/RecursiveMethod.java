public class RecursiveMethod {
    public static void main(String[] args) {
        //buktikan secara manual
        System.out.println(methodRecursive(5));
        System.out.println(recurseiveLoop(5));
        System.out.println(1*2*3*4*5);
    }
    static int methodRecursive(int result){
        if(result == 1) {
            return 1;
        }else {
            return result * methodRecursive(result -1);
        }
    }

    static int recurseiveLoop(int value){
        var result = 1;
        for (var conter = 1; conter <= value; conter++){
            result *= conter;
        }
        return result;
    }
}
