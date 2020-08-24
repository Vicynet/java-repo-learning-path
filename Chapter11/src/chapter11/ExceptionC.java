package chapter11;

public class ExceptionC extends ExceptionB {
    public static void exceptionC() throws Exception {
        exceptionB();
        System.out.println("Exception from B in C");
    }
}
