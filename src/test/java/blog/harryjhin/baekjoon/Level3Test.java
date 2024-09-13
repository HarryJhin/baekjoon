package blog.harryjhin.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 * 브론즈 Ⅲ
 */
public class Level3Test {

    /**
     * <a href="https://www.acmicpc.net/problem/2739">구구단</a>
     * <a href="https://www.acmicpc.net/source/83737215">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("구구단")
    public void problems2739() throws IOException {
        SystemUtil.setIn("2");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10950">A+B - 3</a>
     * <a href="https://www.acmicpc.net/source/83737273">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("A+B - 3")
    public void problems10950() throws IOException {
        SystemUtil.setIn("5\n1 1\n2 3\n3 4\n9 8\n5 2");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
            final String[] ab = reader.readLine().split(" ");
            final int a = Integer.parseInt(ab[0]);
            final int b = Integer.parseInt(ab[1]);

            System.out.println(a + b);
        }
    }

    /**
     * <a href="https://www.acmicpc.net/problem/8393">합</a>
     * <a href="https://www.acmicpc.net/source/83738149">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("합")
    public void problems8393() throws IOException {
        SystemUtil.setIn("3");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/15552">빠른 A+B</a>
     * <a href="https://www.acmicpc.net/source/83738390">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("빠른 A+B")
    public void problems15552() throws IOException {
        SystemUtil.setIn("5\n1 1\n2 3\n3 4\n9 8\n5 2");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int t = Integer.parseInt(reader.readLine());
        final StringBuilder sb = new StringBuilder();

        final java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));
        for (int i = 0; i < t; i++) {
            final String[] ab = reader.readLine().split(" ");
            final int a = Integer.parseInt(ab[0]);
            final int b = Integer.parseInt(ab[1]);

            sb.append(a + b).append("\n");
        }

        writer.write(sb.toString());
        writer.flush();
    }

    /**
     * <a href="https://www.acmicpc.net/problem/25304">영수증</a>
     * <a href="https://www.acmicpc.net/source/83738632">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("영수증")
    public void problems25304() throws IOException {
        SystemUtil.setIn("260000\n4\n20000 5\n30000 2\n10000 6\n5000 8");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int total = Integer.parseInt(reader.readLine());
        final int n = Integer.parseInt(reader.readLine());

        int sum = total;
        for (int i = 0; i < n; i++) {
            final String[] ab = reader.readLine().split(" ");
            final int a = Integer.parseInt(ab[0]);
            final int b = Integer.parseInt(ab[1]);

            sum -= a * b;
        }

        final String actual = sum == 0 ? "Yes" : "No";
        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/25314">코딩은 체육과목 입니다</a>
     * <a href="https://www.acmicpc.net/source/83742924">제출</a>
     */
    @Test
    @Timeout(value = 500, unit = java.util.concurrent.TimeUnit.MILLISECONDS)
    @DisplayName("코딩은 체육과목 입니다")
    public void problems25314() throws IOException {
        SystemUtil.setIn("4");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());

        final int count = n / 4;

        final String actual = "long ".repeat(count) + "int";

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/11021">A+B - 7</a>
     * <a href="https://www.acmicpc.net/source/83743256">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("A+B - 7")
    public void problems11021() throws IOException {
        SystemUtil.setIn("5\n1 1\n2 3\n3 4\n9 8\n5 2");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int t = Integer.parseInt(reader.readLine());
        final StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
            final int a = Integer.parseInt(st.nextToken());
            final int b = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(a + b).append("\n");
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/11022">A+B - 8</a>
     * <a href="https://www.acmicpc.net/source/83743330">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("A+B - 8")
    public void problems11022() throws IOException {
        SystemUtil.setIn("5\n1 1\n2 3\n3 4\n9 8\n5 2");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int t = Integer.parseInt(reader.readLine());
        final StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= t; i++) {
            final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
            final int a = Integer.parseInt(st.nextToken());
            final int b = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2438">별 찍기 - 1</a>
     * <a href="https://www.acmicpc.net/source/83743431">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("별 찍기 - 1")
    public void problems2438() throws IOException {
        SystemUtil.setIn("5");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());

        final StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(i)).append("\n");
        }

        final String actual = sb.toString();

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2439">별 찍기 - 2</a>
     * <a href="https://www.acmicpc.net/source/83743485">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("별 찍기 - 2")
    public void problems2439() throws IOException {
        SystemUtil.setIn("5");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());

        final StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i)).append("*".repeat(i)).append("\n");
        }

        final String actual = sb.toString();

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10952">A+B - 5</a>
     * <a href="https://www.acmicpc.net/source/83743552">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("A+B - 5")
    public void problems10952() throws IOException {
        SystemUtil.setIn("1 1\n2 3\n3 4\n9 8\n5 2\n0 0");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final StringBuilder sb = new StringBuilder();
        while (true) {
            final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
            final int a = Integer.parseInt(st.nextToken());
            final int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            sb.append(a + b).append("\n");
        }

        final String actual = sb.toString();

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10951">A+B - 4</a>
     * <a href="https://www.acmicpc.net/source/83743812">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("A+B - 4")
    public void problems10951() throws IOException {
        SystemUtil.setIn("1 1\n2 3\n3 4\n9 8\n5 2");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        final StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            final java.util.StringTokenizer st = new java.util.StringTokenizer(line);

            final int a = Integer.parseInt(st.nextToken());
            final int b = Integer.parseInt(st.nextToken());

            sb.append(a + b).append("\n");
        }

        final String actual = sb.toString();

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2720">세탁소 사장 동혁</a>
     * <a href="https://www.acmicpc.net/source/83772102">제출</a>
     */
    @Test
    @DisplayName("세탁소 사장 동혁")
    public void problems2720() throws IOException {
        SystemUtil.setIn("3\n124\n25\n194");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

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
    public void problems2903() throws IOException {
        SystemUtil.setIn("1");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        final int dots = (int) Math.pow(2, n) + 1;

        System.out.println(dots * dots);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2675">문자열 반복</a>
     * <a href="https://www.acmicpc.net/source/83803432">제출</a>
     */
    @Test
    @DisplayName("문자열 반복")
    public void problems2675() throws IOException {
        SystemUtil.setIn("2\n3 ABC\n5 /HTP");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int t = Integer.parseInt(reader.readLine());

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            final java.util.StringTokenizer rs = new java.util.StringTokenizer(reader.readLine());
            final int r = Integer.parseInt(rs.nextToken());
            final String s = rs.nextToken();

            for (int j = 0; j < s.length(); j++) {
                sb.append(String.valueOf(s.charAt(j)).repeat(r));
            }
            sb.append("\n");
        }

        final String actual = sb.toString();

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10250">ACM 호텔</a>
     * <a href="https://www.acmicpc.net/source/83808726">제출</a>
     */
    @Test
    @DisplayName("ACM 호텔")
    public void problems10250() throws IOException {
        SystemUtil.setIn("2\n6 12 10\n30 50 72");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int t = Integer.parseInt(reader.readLine());

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            final java.util.StringTokenizer rs = new java.util.StringTokenizer(reader.readLine());
            final int h = Integer.parseInt(rs.nextToken());
            final int w = Integer.parseInt(rs.nextToken());
            final int n = Integer.parseInt(rs.nextToken());

            final int floor = n % h == 0 ? h : n % h;
            final int room = n % h == 0 ? n / h : n / h + 1;

            sb.append(floor).append(String.format("%02d", room)).append("\n");
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10872">팩토리얼</a>
     * <a href="https://www.acmicpc.net/source/83812718">제출</a>
     */
    @Test
    @DisplayName("팩토리얼")
    public void problems10872() throws IOException {
        SystemUtil.setIn("10");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2738">행렬 덧셈</a>
     * <a href="https://www.acmicpc.net/source/83813216">제출</a>
     */
    @Test
    @DisplayName("행렬 덧셈")
    public void problems2738() throws IOException {
        SystemUtil.setIn("3 3\n1 1 1\n2 2 2\n0 1 0\n 3 3 3\n 4 4 4\n5 5 100");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final java.util.StringTokenizer rs = new java.util.StringTokenizer(reader.readLine());
        final int n = Integer.parseInt(rs.nextToken());
        final int m = Integer.parseInt(rs.nextToken());

        final int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                sb.append(a[i][j] + Integer.parseInt(st.nextToken())).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2754">학점계산</a>
     * <a href="https://www.acmicpc.net/source/83814115">제출</a>
     */
    @Test
    @DisplayName("학점계산")
    public void problems2754() throws IOException {
        SystemUtil.setIn("A+");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final String grade = reader.readLine();

        String actual = "";
        switch (grade) {
            case "A+":
                actual = "4.3";
                break;
            case "A0":
                actual = "4.0";
                break;
            case "A-":
                actual = "3.7";
                break;
            case "B+":
                actual = "3.3";
                break;
            case "B0":
                actual = "3.0";
                break;
            case "B-":
                actual = "2.7";
                break;
            case "C+":
                actual = "2.3";
                break;
            case "C0":
                actual = "2.0";
                break;
            case "C-":
                actual = "1.7";
                break;
            case "D+":
                actual = "1.3";
                break;
            case "D0":
                actual = "1.0";
                break;
            case "D-":
                actual = "0.7";
                break;
            case "F":
                actual = "0.0";
                break;
        }

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/11718">그대로 출력하기</a>
     * <a href="https://www.acmicpc.net/source/83814198">제출</a>
     */
    @Test
    @DisplayName("그대로 출력하기")
    public void problems11718() throws IOException {
        SystemUtil.setIn("Hello\nBaekjoon\nOnline Judge");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }

        final String actual = sb.toString();

        System.out.println(actual);
    }
}
