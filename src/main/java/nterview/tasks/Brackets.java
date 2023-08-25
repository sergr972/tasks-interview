package main.java.nterview.tasks;

public class Brackets {

    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));  // true
        System.out.println(isBalanced("()()"));  // true
        System.out.println(isBalanced("((())"));  // false
    }

    private static boolean isBalanced(String bracket) {
        char[] array = bracket.toCharArray();
        if (array.length % 2 != 0) return false;
        int d = 0;
        for (char c : array) {
            d += c == '(' ? 1 : -1;
            if (d < 0) return false;
        }
        return true;
    }
}
