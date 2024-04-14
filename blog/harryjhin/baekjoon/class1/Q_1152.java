package blog.harryjhin.baekjoon.class1;

import java.util.Scanner;

/**
 * 단어의 개수<br>
 * <a href="https://www.acmicpc.net/problem/1152">Url</a>
 */
public final class Q_1152 {

    public static void main(final String[] args) {
        final String[] words = new Scanner(System.in).nextLine().trim().split(" ");
        System.out.println(words[0].isEmpty() ? 0 : words.length);
    }
}