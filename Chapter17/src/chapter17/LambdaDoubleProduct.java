package chapter17;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class LambdaDoubleProduct {
    public static void main(String[] args) {
        double first = 3.0;
        double second = 3.0;

//        System.out.println(DoubleStream.of(first*second).sum());

        double[] forNumbers = {3.0, 3.0};

        System.out.println(DoubleStream.of(forNumbers)
                .reduce(1, (double x, double y) -> x * y));
        System.out.println(DoubleStream.of(forNumbers)
                .reduce(1, (x, y) -> x * y));
        System.out.println(DoubleStream.of(forNumbers)
                .reduce(1, (x, y) -> { return x * y;}));

//        () -> System.out.println("Welcome to Lambdas!");

        ArrayList<String> localArray = new ArrayList<>();


    }
}
