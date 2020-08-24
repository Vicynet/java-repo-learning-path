package chapter17;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class RandomLetters {
    public static void main(String[] args) {
        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        SecureRandom randomize = new SecureRandom();

        List<Character> randomLetters = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            randomLetters.add(letters[randomize.nextInt(25)]);
        }
        System.out.println(randomLetters.stream().sorted().collect(Collectors.toList()));

    }
}
