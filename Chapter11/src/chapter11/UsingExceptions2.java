package chapter11;

// Stack unwinding and obtaining data from an exception object.
public class UsingExceptions2 {
    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
            // obtain the stack-trace information
            StackTraceElement[] traceElements = exception.getStackTrace();
            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\t\t\t\t\tFile\t\t\t\t\tLine Method");

            // loop through traceElements to get exception description
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf(" %s\n", element.getMethodName());
            }
        }
    }

    // call method2; throw exceptions back to main
    public static void method1() throws Exception {
        method2();
    }
    // call method3; throw exceptions back to method1
    public static void method2() throws Exception {
        method3();
    }
    // call method3; throw exceptions back to method1
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
