package basicalgorithm.java0x02;

import java.util.*;
import java.io.*;

public class ThreeDices {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(tokenizer.nextToken());
        int second = Integer.parseInt(tokenizer.nextToken());
        int third = Integer.parseInt(tokenizer.nextToken());
        System.out.println(prize(first, second, third));
    }

    private static int prize(int a, int b, int c) {
        if (a == b && b == c) {
            return allSame(a);
        }
        if (a == b || a == c) {
            return twoSame(a);
        } else if (b == c) {
            return twoSame(b);
        }
        return allDifferent(max(a, b, c));
    }

    private static int allSame(int num) {
        return 10000 + (num * 1000);
    }

    private static int twoSame(int num) {
        return 1000 + (num * 100);
    }

    private static int allDifferent(int max) {
        return max * 100;
    }

    private static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
