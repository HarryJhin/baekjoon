package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Level1Test {

    /**
     * <a href="https://www.acmicpc.net/problem/1000">A+B</a>
     * <a href="https://www.acmicpc.net/source/76954369">제출</a>
     */
    @Test
    @Timeout(2)
    @DisplayName("A+B")
    public void problems1000() {
        SystemUtil.setIn("1 2");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        assertEquals(3, a + b);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/1001">A-B</a>
     * <a href="https://www.acmicpc.net/source/76954460">제출</a>
     */
    @Test
    @Timeout(2)
    @DisplayName("A-B")
    public void problems1001() {
        SystemUtil.setIn("3 2");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        assertEquals(1, a - b);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10998">A×B</a>
     * <a href="https://www.acmicpc.net/source/76954552">제출</a>
     */
    @Test
    @Timeout(2)
    @DisplayName("A×B")
    public void problems10998() {
        SystemUtil.setIn("3 4");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        assertEquals(12, a * b);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/1008">A/B</a>
     * <a href="https://www.acmicpc.net/source/76954744">제출</a>
     */
    @Test
    @Timeout(2)
    @DisplayName("A/B")
    public void problems1008() {
        SystemUtil.setIn("1 3");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final double a = scanner.nextDouble();
        final double b = scanner.nextDouble();

        assertEquals(0.3333333333333333, a / b);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10869">사칙연산</a>
     * <a href="https://www.acmicpc.net/source/76954844">제출</a>
     */
    @Test
    @Timeout(2)
    @DisplayName("사칙연산")
    public void problems10869() {
        SystemUtil.setIn("7 3");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        assertEquals(10, a + b);
        assertEquals(4, a - b);
        assertEquals(21, a * b);
        assertEquals(2, a / b);
        assertEquals(1, a % b);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10926">??!</a>
     * <a href="https://www.acmicpc.net/source/83735937">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("??!")
    public void problems10926() {
        SystemUtil.setIn("joonas");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final String s = scanner.next();

        final String actual = s + "??!";

        System.out.println(actual);

        assertEquals("joonas??!", actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/18108">1998년생인 내가 태국에서는 2541년생?!</a>
     * <a href="https://www.acmicpc.net/source/83736000">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("1998년생인 내가 태국에서는 2541년생?!")
    public void problems18108() {
        SystemUtil.setIn("2541");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int year = scanner.nextInt();

        final int actual = year - 543;

        System.out.println(actual);

        assertEquals(1998, actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/10430">나머지</a>
     * <a href="https://www.acmicpc.net/source/83736050">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("나머지")
    public void problems10430() {
        SystemUtil.setIn("5 8 4");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final int actual1 = (a + b) % c;
        final int actual2 = ((a % c) + (b % c)) % c;
        final int actual3 = (a * b) % c;
        final int actual4 = ((a % c) * (b % c)) % c;

        System.out.println(actual1);
        System.out.println(actual2);
        System.out.println(actual3);
        System.out.println(actual4);

        assertEquals(1, actual1);
        assertEquals(1, actual2);
        assertEquals(0, actual3);
        assertEquals(0, actual4);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2588">곱셈</a>
     * <a href="https://www.acmicpc.net/source/83736165">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("곱셈")
    public void problems2588() {
        SystemUtil.setIn("472\n385");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();

        final int c = b % 10;
        final int d = (b / 10) % 10;
        final int e = b / 100;

        final int actual1 = a * c;
        final int actual2 = a * d;
        final int actual3 = a * e;
        final int actual4 = a * b;

        System.out.println(actual1);
        System.out.println(actual2);
        System.out.println(actual3);
        System.out.println(actual4);

        assertEquals(2360, actual1);
        assertEquals(3776, actual2);
        assertEquals(1416, actual3);
        assertEquals(181720, actual4);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2525">오븐 시계</a>
     * <a href="https://www.acmicpc.net/source/83736654">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("오븐 시계")
    public void problems2525() {
        SystemUtil.setIn("14 30\n20");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        final int t = scanner.nextInt();

        m += t;
        if (m >= 60) {
            h += m / 60;
            m %= 60;
        }
        if (h >= 24) {
            h %= 24;
        }

        final String actual = h + " " + m;

        System.out.println(actual);

        assertEquals("14 50", actual);
    }

    /**
     * <a href="https://www.acmicpc.net/problem/2480">주사위 세개</a>
     * <a href="https://www.acmicpc.net/source/83736900">제출</a>
     */
    @Test
    @Timeout(1)
    @DisplayName("주사위 세개")
    public void problems2480() {
        SystemUtil.setIn("3 3 6");
        final java.util.Scanner scanner = new java.util.Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final int actual;
        if (a == b && b == c) {
            actual = 10000 + a * 1000;
        } else if (a == b || a == c) {
            actual = 1000 + a * 100;
        } else if (b == c) {
            actual = 1000 + b * 100;
        } else {
            actual = Math.max(Math.max(a, b), c) * 100;
        }

        System.out.println(actual);

        assertEquals(1300, actual);
    }
}
