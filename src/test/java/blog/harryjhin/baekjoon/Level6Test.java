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
}
