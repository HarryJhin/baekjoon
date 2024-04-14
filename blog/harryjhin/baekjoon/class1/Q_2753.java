package blog.harryjhin.baekjoon.class1;

import java.util.Scanner;

/**
 * 윤년<br>
 * <a href="https://www.acmicpc.net/problem/2753">Url</a>
 */
public final class Q_2753 {

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}