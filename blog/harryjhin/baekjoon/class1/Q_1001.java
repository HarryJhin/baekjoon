package blog.harryjhin.baekjoon.class1;

import java.util.Scanner;

/**
 * A-B<br>
 * <a href="https://www.acmicpc.net/problem/1001">Url</a>
 */
public final class Q_1001 {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        System.out.println(a - b);
    }
}