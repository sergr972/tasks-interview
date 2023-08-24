package main.java;

public class App {
    public static void main(String[] args) {
        System.out.println(truncate("hexlet", 3));
    }

    public static String truncate(String text, int length) {
        // BEGIN (write your solution here)
        return text.substring(0, length) + "...";
        // END
    }
}
