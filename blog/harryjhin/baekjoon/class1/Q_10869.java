package blog.harryjhin.baekjoon.class1;

import java.util.Scanner;

/**
 * 사칙연산<br>
 * <a href="https://www.acmicpc.net/problem/10869">Url</a>
 */
public final class Q_10869 {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}