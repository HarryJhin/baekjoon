package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class Level4Test {

    /**
     * <a href="https://www.acmicpc.net/problem/10807">개수 세기</a>
     * <a href="https://www.acmicpc.net/source/83762120">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("개수 세기")
    public void problems10807() throws java.io.IOException {
        SystemUtil.setIn("11\n1 4 1 2 4 2 4 2 3 4 4\n2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
        final int v = Integer.parseInt(reader.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == v) {
                count++;
            }
        }

        System.out.println(count);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10871">X보다 작은 수</a>
     * <a href="https://www.acmicpc.net/source/83762498">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("X보다 작은 수")
    public void problems10871() throws java.io.IOException {
        SystemUtil.setIn("10 5\n1 10 4 9 2 3 8 5 7 6");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
        final int n = Integer.parseInt(st.nextToken());
        final int x = Integer.parseInt(st.nextToken());
        final java.util.StringTokenizer a = new java.util.StringTokenizer(reader.readLine());

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            final int y = Integer.parseInt(a.nextToken());
            if (y < x) {
                sb.append(y).append(" ");
            }
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10818">최소, 최대</a>
     * <a href="https://www.acmicpc.net/source/83763086">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("최소, 최대")
    public void problems10818() throws java.io.IOException {
        SystemUtil.setIn("5\n20 10 35 30 7");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());

        int min = 1000000;
        int max = -1000000;
        for (int i = 0; i < n; i++) {
            final int x = Integer.parseInt(st.nextToken());
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        System.out.println(min + " " + max);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2562">최댓값</a>
     * <a href="https://www.acmicpc.net/source/83763237">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("최댓값")
    public void problems2562() throws java.io.IOException {
        SystemUtil.setIn("3\n29\n38\n12\n57\n74\n40\n85\n61");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int max = 0;
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            final int x = Integer.parseInt(reader.readLine());
            if (x > max) {
                max = x;
                index = i;
            }
        }

        System.out.println(max + "\n" + index);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10810">공 넣기</a>
     * <a href="https://www.acmicpc.net/source/83766033">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("공 넣기")
    public void problems10810() throws java.io.IOException {
        SystemUtil.setIn("5 4\n1 2 3\n3 4 4\n1 4 1\n2 2 2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
        final int n = Integer.parseInt(st.nextToken());
        final int m = Integer.parseInt(st.nextToken());
        final int[] basket = new int[n];

        for (int x = 0; x < m; x++) {
            final java.util.StringTokenizer ijk = new java.util.StringTokenizer(reader.readLine());
            final int i = Integer.parseInt(ijk.nextToken()) - 1;
            final int j = Integer.parseInt(ijk.nextToken()) - 1;
            final int k = Integer.parseInt(ijk.nextToken());

            for (int y = i; y <= j; y++) {
                basket[y] = k;
            }
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(basket[i]).append(" ");
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10813">공 바꾸기</a>
     * <a href="https://www.acmicpc.net/source/83766178">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("공 바꾸기")
    public void problems10813() throws java.io.IOException {
        SystemUtil.setIn("5 3\n1 2\n3 4\n1 4\n2 2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
        final int n = Integer.parseInt(st.nextToken());
        final int m = Integer.parseInt(st.nextToken());
        final int[] basket = new int[n];

        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int x = 0; x < m; x++) {
            final java.util.StringTokenizer ab = new java.util.StringTokenizer(reader.readLine());
            final int a = Integer.parseInt(ab.nextToken()) - 1;
            final int b = Integer.parseInt(ab.nextToken()) - 1;

            final int temp = basket[a];
            basket[a] = basket[b];
            basket[b] = temp;
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(basket[i]).append(" ");
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/5597">과제 안 내신 분..?</a>
     * <a href="https://www.acmicpc.net/source/83766359">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("과제 안 내신 분..?")
    public void problems5597() throws java.io.IOException {
        SystemUtil.setIn("3\n1\n4\n5\n7\n9\n6\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final boolean[] students = new boolean[30];
        for (int i = 0; i < 28; i++) {
            final int x = Integer.parseInt(reader.readLine());
            students[x - 1] = true;
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            if (!students[i]) {
                sb.append(i + 1).append("\n");
            }
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/3052">나머지</a>
     * <a href="https://www.acmicpc.net/source/83766679">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("나머지")
    public void problems3052() throws java.io.IOException {
        SystemUtil.setIn("1\n2\n3\n4\n5\n6\n7\n8\n9\n10");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final boolean[] remainders = new boolean[42];
        for (int i = 0; i < 10; i++) {
            final int x = Integer.parseInt(reader.readLine());
            remainders[x % 42] = true;
        }

        int count = 0;
        for (boolean remainder : remainders) {
            if (remainder) {
                count++;
            }
        }

        System.out.println(count);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10811">바구니 순서 바꾸기</a>
     * <a href="https://www.acmicpc.net/source/83767347">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("바구니 순서 바꾸기")
    public void problems10811() throws java.io.IOException {
        SystemUtil.setIn("5 4\n1 2\n3 4\n1 4\n2 2");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());
        final int n = Integer.parseInt(st.nextToken());
        final int m = Integer.parseInt(st.nextToken());
        final int[] basket = new int[n + 1];

        for (int x = 1; x <= n; x++) {
            basket[x] = x;
        }

        for (int x = 0; x < m; x++) {
            final java.util.StringTokenizer ij = new java.util.StringTokenizer(reader.readLine());
            final int i = Integer.parseInt(ij.nextToken());
            final int j = Integer.parseInt(ij.nextToken());

            if (i >= j) {
                continue;
            }

            final int[] temp = new int[j - i + 1];
            System.arraycopy(basket, i, temp, 0, temp.length);

            for (int y = 0; y < temp.length; y++) {
                basket[j - y] = temp[y];
            }
        }

        final StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(basket[i]).append(" ");
        }

        System.out.println(sb);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/1546">평균</a>
     * <a href="https://www.acmicpc.net/source/83767693">제출</a>
     */
    @Test
    @Timeout(2)
    @DisplayName("평균")
    public void problems1546() throws java.io.IOException {
        SystemUtil.setIn("3\n40 80 60");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        final java.util.StringTokenizer st = new java.util.StringTokenizer(reader.readLine());

        double sum = 0;
        double max = 0;
        for (int i = 0; i < n; i++) {
            final int score = Integer.parseInt(st.nextToken());
            sum += score;
            max = Math.max(max, score);
        }

        final double average = (sum / max * 100) / n;
        System.out.println(average);
    }
}
