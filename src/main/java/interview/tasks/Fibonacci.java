package main.java.interview.tasks;

import java.util.stream.Stream;

public class Fibonacci {
    private static final int NUM = 10;

    public static void main(String[] args) {
        System.out.println(getFibonacciValue(NUM));
        System.out.println(sumFibonacciValue());
    }

    public static int getFibonacciValue(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else  {
            return getFibonacciValue(n - 1) + getFibonacciValue(n - 2);
        }
    }

    private static int sumFibonacciValue() {
        return Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(Fibonacci.NUM)
                .map(t -> t[0])
                .mapToInt(Integer::intValue)
                .sum();
    }
}
