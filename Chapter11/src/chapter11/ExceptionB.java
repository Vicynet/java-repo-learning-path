package chapter11;

public class ExceptionB extends ExceptionA {
    public static void exceptionB() throws Exception {
        exceptionA();
        System.out.println("Exception from A in B");
    }

}
