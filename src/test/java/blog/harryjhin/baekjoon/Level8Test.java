package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Level8Test {

    /**
     * <a href="https://www.acmicpc.net/problem/2745">진법 변환</a>
     * <a href="https://www.acmicpc.net/source/83768551">제출</a>
     */
    @Test
    @DisplayName("진법 변환")
    public void problems2745() throws java.io.IOException {
        SystemUtil.setIn("ZZZZZ 36");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final java.util.StringTokenizer nb = new java.util.StringTokenizer(reader.readLine());
        final String n = nb.nextToken();
        final int b = Integer.parseInt(nb.nextToken());

        System.out.println(Integer.parseInt(n, b));
    }

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
     * <a href="https://www.acmicpc.net/problem/2720">세탁소 사장 동혁</a>
     * <a href="https://www.acmicpc.net/source/83772102">제출</a>
     */
    @Test
    @DisplayName("세탁소 사장 동혁")
    public void problems2720() throws java.io.IOException {
        SystemUtil.setIn("3\n124\n25\n194");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int[] coins = {25, 10, 5, 1};
        final int t = Integer.parseInt(reader.readLine());

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(reader.readLine());
            for (int coin : coins) {
                sb.append(c / coin).append(" ");
                c %= coin;
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2903">중앙 이동 알고리즘</a>
     * <a href="https://www.acmicpc.net/source/83772617">제출</a>
     */
    @Test
    @DisplayName("중앙 이동 알고리즘")
    public void problems2903() throws java.io.IOException {
        SystemUtil.setIn("1");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        final int dots = (int) Math.pow(2, n) + 1;

        System.out.println(dots * dots);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2292">벌집</a>
     * <a href="https://www.acmicpc.net/source/83773458">제출</a>
     */
    @Test
    @DisplayName("벌집")
    public void problems2292() throws java.io.IOException {
        SystemUtil.setIn("13");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        int floor = 1;
        int total = 1;

        while (total < n) {
            total += 6 * floor;
            floor++;
        }

        System.out.println(floor);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/1193">분수찾기</a>
     * <a href="https://www.acmicpc.net/source/83774915">제출</a>
     */
    @Test
    @DisplayName("분수찾기")
    public void problems1193() throws java.io.IOException {
        SystemUtil.setIn("14");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int line = 1;

        while (x > line) {
            x -= line;
            line++;
        }

        if (line % 2 == 0) {
            System.out.println(x + "/" + (line - x + 1));
        } else {
            System.out.println((line - x + 1) + "/" + x);
        }
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
