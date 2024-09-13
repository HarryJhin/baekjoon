package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 실버 Ⅴ
 */
public class Level6Test {

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
     * <a href="https://www.acmicpc.net/problem/11723">집합</a>
     * <a href="https://www.acmicpc.net/source/83815606">제출</a>
     */
    @Test
    @DisplayName("집합")
    public void problems11723() throws java.io.IOException {
        SystemUtil.setIn("26\n" +
                "add 1\n" +
                "add 2\n" +
                "check 1\n" +
                "check 2\n" +
                "check 3\n" +
                "remove 2\n" +
                "check 1\n" +
                "check 2\n" +
                "toggle 3\n" +
                "check 1\n" +
                "check 2\n" +
                "check 3\n" +
                "check 4\n" +
                "all\n" +
                "check 10\n" +
                "check 20\n" +
                "toggle 10\n" +
                "remove 20\n" +
                "check 10\n" +
                "check 20\n" +
                "empty\n" +
                "check 1\n" +
                "toggle 1\n" +
                "check 1\n" +
                "toggle 1\n" +
                "check 1");
        final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        final java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out));

        int m = Integer.parseInt(reader.readLine());
        int s = 0;

        while (m-- > 0) {
            final java.util.StringTokenizer opx = new java.util.StringTokenizer(reader.readLine());
            final String op = opx.nextToken();
            int x = 0;

            if (opx.hasMoreTokens()) {
                x = Integer.parseInt(opx.nextToken());
            }

            switch (op) {
                case "add":
                    s |= (1 << x);
                    break;
                case "remove":
                    s &= ~(1 << x);
                    break;
                case "check":
                    writer.write(((s & (1 << x)) > 0 ? 1 : 0) + "\n");
                    break;
                case "toggle":
                    s ^= (1 << x);
                    break;
                case "all":
                    s = (1 << 21) - 1;
                    break;
                case "empty":
                    s = 0;
                    break;
            }

            System.out.println(s);
        }

        writer.flush();
    }
}
