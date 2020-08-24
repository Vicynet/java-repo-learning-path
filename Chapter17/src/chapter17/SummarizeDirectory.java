package chapter17;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummarizeDirectory {
    public static void main(String[] args) throws IOException {
//        Files.newDirectoryStream(Paths.get("C:\\Users\\s\\Desktop\\Java").toAbsolutePath(),
//                path -> path.toString().endsWith(".java"))
//                .forEach(System.out::println);
//
//
//
//        Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\s\\Desktop\\Java"))) {
//            paths.map(path -> path.toString()).filter(f -> f.endsWith(".pdf")).count();
//                    .forEach(System.out::println);

        try (Stream<Path> stream = Files.list(Paths.get("C:\\\\Users\\\\s\\\\Desktop"))) {
            Map<String, Long> fileExtCountMap = stream.filter(Files::isRegularFile)
                    .map(f -> f.getFileName().toString().toUpperCase())
                    .map(n -> n.substring(n.lastIndexOf(".") + 1))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            fileExtCountMap.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
        }
    }
}
