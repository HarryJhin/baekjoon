package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 실버 Ⅲ
 */
public class Level8Test {

    /**
     * <a href="https://www.acmicpc.net/problem/1003">피보나치 함수</a>
     * <a href="https://www.acmicpc.net/source/83838445">제출</a>
     */
    @Test
    @DisplayName("피보나치 함수")
    public void problem1003() throws IOException {
        SystemUtil.setIn("3\n0\n1\n3");

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(reader.readLine());

        final int[][] fibonacci = new int[41][2];
        fibonacci[0][0] = 1;
        fibonacci[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            fibonacci[i][0] = fibonacci[i - 1][0] + fibonacci[i - 2][0];
            fibonacci[i][1] = fibonacci[i - 1][1] + fibonacci[i - 2][1];
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine());
            sb.append(fibonacci[N][0]).append(" ").append(fibonacci[N][1]).append("\n");
        }

        System.out.println(sb);
    }
}
