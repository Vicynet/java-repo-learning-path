package chapter17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// Counting word occurrences in a text file.
public class StreamOfLines {
    public static void main(String[] args) throws IOException, NoSuchFileException {
        // Regex that matches one or more consecutive whitespace characters
//        Pattern pattern = Pattern.compile("\\s+");
        Pattern pattern = Pattern.compile("(?!^)");

        // count occurrences of each word in a Stream<String> sorted by word
        try {
            Map<String, Long> wordCounts =
                    Files.lines(Paths.get("Chapter2Paragraph.txt"))//.map(line -> line.replaceAll("(?!')\\p{P}", ""))
                            .flatMap(line -> pattern.splitAsStream(line))
                            .collect(Collectors.groupingBy(String::toLowerCase,
                                    TreeMap::new, Collectors.counting()));

            // display the words grouped by starting letter
            wordCounts.entrySet()
                    .stream()
                    .collect(
                            Collectors.groupingBy(entry -> entry.getKey().charAt(0),
                                    TreeMap::new, Collectors.toList()))
                    .forEach((letter, wordList) ->
                    {
                        System.out.printf("%n%C%n", letter);
                        wordList.stream().forEach(word -> System.out.printf(
                                "%13s: %d%n", word.getKey(), word.getValue()));
                    });
        }
        catch (NoSuchFileException k) {
            System.out.println("File does not exist");
        }
    }
}
