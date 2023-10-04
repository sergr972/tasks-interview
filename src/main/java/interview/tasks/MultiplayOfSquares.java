package src.main.java.interview.tasks;

import java.util.Arrays;
import java.util.List;

public class MultiplayOfSquares {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 20);
        long val = numbers.stream().map(Integer::longValue).reduce(1L, (acc, x) -> acc * x * x);
        System.out.println(val);
    }
}
