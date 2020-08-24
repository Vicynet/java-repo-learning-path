package chapter11;

public class TestExceptionABC {
    public static void main(String[] args) {
        ExceptionA exceptionA = new ExceptionA();

        try {
            exceptionA.exceptionA();
        } catch (Exception e) {
            e.printStackTrace();
            // obtain the stack-trace information
            StackTraceElement[] traceElements = e.getStackTrace();
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf(" %s\n", element.getMethodName());
            }
        }
    }
}
