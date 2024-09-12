package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 브론즈 Ⅰ
 */
public class Level5Test {

    /**
     * <a href="https://www.acmicpc.net/problem/11005">진법 변환 2</a>
     * <a href="https://www.acmicpc.net/source/83771640">제출</a>
     */
    @Test
    @DisplayName("진법 변환 2")
    public void problems11005() throws java.io.IOException {
        SystemUtil.setIn("60466175 36");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final java.util.StringTokenizer nb = new java.util.StringTokenizer(reader.readLine());
        final java.math.BigInteger n = new java.math.BigInteger(nb.nextToken());
        final int b = Integer.parseInt(nb.nextToken());

        System.out.println(n.toString(b).toUpperCase());
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2869">달팽이는 올라가고 싶다</a>
     * <a href="https://www.acmicpc.net/source/83776553">제출</a>
     */
    @Test
    @DisplayName("달팽이는 올라가고 싶다")
    public void problems2869() throws java.io.IOException {
        SystemUtil.setIn("2 1 5");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
        final int a = Integer.parseInt(st.nextToken());
        final int b = Integer.parseInt(st.nextToken());
        final int v = Integer.parseInt(st.nextToken());

        int day = (v - b) / (a - b) + ((v - b) % (a - b) == 0 ? 0 : 1);

        System.out.println(day);
    }
}
