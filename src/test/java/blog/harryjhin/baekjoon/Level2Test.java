package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 브론즈 Ⅳ
 */
public class Level2Test {

    /**
     * <a href="https://www.acmicpc.net/problem/1330">두 수 비교하기</a>
     * <a href="https://www.acmicpc.net/source/83736269">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("두 수 비교하기")
    public void problems1330() {
        SystemUtil.setIn("1 2");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        final String actual = a > b ? ">" : a < b ? "<" : "==";

        System.out.println(actual);

        assertEquals("<", actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/9498">시험 성적</a>
     * <a href="https://www.acmicpc.net/source/83736309">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("시험 성적")
    public void problems9498() {
        SystemUtil.setIn("100");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int score = scanner.nextInt();

        final String actual = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";

        System.out.println(actual);

        assertEquals("A", actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2753">윤년</a>
     * <a href="https://www.acmicpc.net/source/83736336">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("윤년")
    public void problems2753() {
        SystemUtil.setIn("2000");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int year = scanner.nextInt();

        final String actual = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "1" : "0";

        System.out.println(actual);

        assertEquals("1", actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/14681">사분면 고르기</a>
     * <a href="https://www.acmicpc.net/source/83736469">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("사분면 고르기")
    public void problems14681() {
        SystemUtil.setIn("12\n5");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int x = scanner.nextInt();
        final int y = scanner.nextInt();

        final int actual = x > 0 ? y > 0 ? 1 : 4 : y > 0 ? 2 : 3;

        System.out.println(actual);

        assertEquals(1, actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2884">알람 시계</a>
     * <a href="https://www.acmicpc.net/source/83736549">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("알람 시계")
    public void problems2884() {
        SystemUtil.setIn("10 10");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        m -= 45;
        if (m < 0) {
            m += 60;
            h--;
            if (h < 0) {
                h = 23;
            }
        }

        final String actual = h + " " + m;

        System.out.println(actual);

        assertEquals("9 25", actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/11720">숫자의 합</a>
     * <a href="https://www.acmicpc.net/source/83803096">제출</a>
     */
    @Test
    @DisplayName("숫자의 합")
    public void problems11720() throws java.io.IOException {
        SystemUtil.setIn("5\n54321");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        final String s = reader.readLine();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0';
        }

        final int actual = sum;

        System.out.println(actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/31403">A + B - C</a>
     * <a href="https://www.acmicpc.net/source/83804307">제출</a>
     */
    @Test
    @DisplayName("A + B - C")
    public void problems31403() throws java.io.IOException {
        SystemUtil.setIn("3\n4\n5");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        final int a = Integer.parseInt(reader.readLine());
        final int b = Integer.parseInt(reader.readLine());
        final int c = Integer.parseInt(reader.readLine());

        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(a + Integer.toString(b)) - c);
    }
}
