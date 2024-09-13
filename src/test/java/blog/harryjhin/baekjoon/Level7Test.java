package blog.harryjhin.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

/**
 * 실버 Ⅳ
 */
public class Level7Test {

    /**
     * <a href="https://www.acmicpc.net/problem/1764">듣보잡</a>
     * <a href="https://www.acmicpc.net/source/83832473">제출</a>
     */
    @Test
    @DisplayName("듣보잡")
    public void problems1764() throws IOException {
        SystemUtil.setIn("3 4\n" +
                "ohhenrie\n" +
                "charlie\n" +
                "baesangwook\n" +
                "obama\n" +
                "baesangwook\n" +
                "ohhenrie\n" +
                "clinton");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final StringTokenizer nm = new StringTokenizer(reader.readLine());
        final int n = Integer.parseInt(nm.nextToken());
        final int m = Integer.parseInt(nm.nextToken());

        final Set<String> unheard = new HashSet<>();
        final ArrayList<String> actual = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            unheard.add(reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            final String name = reader.readLine();

            if (unheard.contains(name)) {
                actual.add(name);
            }
        }

        Collections.sort(actual);

        writer.write(actual.size() + "\n");
        for (final String name : actual) {
            writer.write(name + "\n");
        }

        writer.flush();
    }

    /**
     * <a href="https://www.acmicpc.net/problem/11399">ATM</a>
     * <a href="https://www.acmicpc.net/source/83833138">제출</a>
     */
    @Test
    @DisplayName("ATM")
    public void problems11399() throws IOException {
        SystemUtil.setIn("5\n" +
                "3 1 4 3 2");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int n = Integer.parseInt(reader.readLine());
        final StringTokenizer token = new StringTokenizer(reader.readLine());

        final ArrayList<Integer> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            times.add(Integer.parseInt(token.nextToken()));
        }

        Collections.sort(times);

        int sum = 0;
        int actual = 0;

        for (int i = 0; i < n; i++) {
            sum += times.get(i);
            actual += sum;
        }

        System.out.println(actual);
    }
}
