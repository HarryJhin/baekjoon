package blog.harryjhin.baekjoon.class1;

import java.util.Scanner;

/**
 * 두 수 비교하기<br>
 * <a href="https://www.acmicpc.net/problem/1330">Url</a>
 */
public final class Q_1330 {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}