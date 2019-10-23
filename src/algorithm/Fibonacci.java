package algorithm;

/**
 * 斐波那契数列
 * 1 1 2 3 5 8
 */
public class Fibonacci {
    public static int getNum(int index) {
        if (index < 1) {
            throw new RuntimeException("invalid index");
        }
        if (index == 1 || index == 2) {
            return 1;
        } else {
            return getNum(index - 1) + getNum(index - 2);
        }
    }
}