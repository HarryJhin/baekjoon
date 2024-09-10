package blog.harryjhin.baekjoon;

import java.io.ByteArrayInputStream;

public class SystemUtil {

    public static void setIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
}
