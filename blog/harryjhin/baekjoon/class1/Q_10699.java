package blog.harryjhin.baekjoon.class1;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 오늘 날짜<br>
 * <a href="https://www.acmicpc.net/problem/10699">Url</a>
 */
public final class Q_10699 {

    public static void main(final String[] args) {
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toLocalDate());
    }
}