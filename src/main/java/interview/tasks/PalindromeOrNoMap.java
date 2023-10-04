package src.main.java.interview.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PalindromeOrNoMap {
    public static void main(String[] args) {
        String[] words = {"level", "bbaa", "ac"};
        Map<Boolean, List<String>> palindromeOrNoMap =
                Arrays.stream(words)
                        .collect(Collectors.partitioningBy(a -> a.contentEquals(new StringBuilder(a).reverse())));
        System.out.println(palindromeOrNoMap);
    }
}
