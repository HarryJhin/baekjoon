package blog.harryjhin.baekjoon.class1;

import java.util.Scanner;

/**
 * A/B<br>
 * <a href="https://www.acmicpc.net/problem/1008">Url</a>
 */
public final class Q_1008 {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double a = scanner.nextInt();
        final double b = scanner.nextInt();

        System.out.println(a / b);
    }
}