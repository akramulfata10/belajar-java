package coding.java.now.util;

public class StaticBlock {
    public static final int PROCESSOR;
    //method static
    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
