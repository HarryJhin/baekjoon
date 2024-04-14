package blog.harryjhin.baekjoon.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 빠른 A+B<br>
 * <a href="https://www.acmicpc.net/problem/15552">Url</a>
 */
public final class Q_15552 {

    public static void main(final String[] args) {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            final int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                final String[] input = br.readLine().split(" ");
                final int a = Integer.parseInt(input[0]);
                final int b = Integer.parseInt(input[1]);

                bw.write(a + b + "\n");
            }
        } catch (Exception ignored) {
        } finally {
            try {
                bw.flush();
                bw.close();
                br.close();
            } catch (Exception ignored) {
            }
        }
    }
}