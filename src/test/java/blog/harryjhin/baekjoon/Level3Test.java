package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class Level3Test {

    /**
     * <a href="https://www.acmicpc.net/problem/2739">구구단</a>
     * <a href="https://www.acmicpc.net/source/83737215">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("구구단")
    public void problems2739() throws java.io.IOException {
        SystemUtil.setIn("2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems10950() throws java.io.IOException {
        SystemUtil.setIn("5\n1 1\n2 3\n3 4\n9 8\n5 2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems8393() throws java.io.IOException {
        SystemUtil.setIn("3");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems15552() throws java.io.IOException {
        SystemUtil.setIn("5\n1 1\n2 3\n3 4\n9 8\n5 2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems25304() throws java.io.IOException {
        SystemUtil.setIn("260000\n4\n20000 5\n30000 2\n10000 6\n5000 8");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems25314() throws java.io.IOException {
        SystemUtil.setIn("4");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());

        final int count = n / 4;

        final StringBuilder sb = new StringBuilder();
        sb.append("long ".repeat(count));
        sb.append("int");

        final String actual = sb.toString();

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/11021">A+B - 7</a>
     * <a href="https://www.acmicpc.net/source/83743256">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("A+B - 7")
    public void problems11021() throws java.io.IOException {
        SystemUtil.setIn("5\n1 1\n2 3\n3 4\n9 8\n5 2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems11022() throws java.io.IOException {
        SystemUtil.setIn("5\n1 1\n2 3\n3 4\n9 8\n5 2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems2438() throws java.io.IOException {
        SystemUtil.setIn("5");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems2439() throws java.io.IOException {
        SystemUtil.setIn("5");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems10952() throws java.io.IOException {
        SystemUtil.setIn("1 1\n2 3\n3 4\n9 8\n5 2\n0 0");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
    public void problems10951() throws java.io.IOException {
        SystemUtil.setIn("1 1\n2 3\n3 4\n9 8\n5 2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

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
}