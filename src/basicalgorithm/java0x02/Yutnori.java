package basicalgorithm.java0x02;

import java.io.*;
import java.util.*;

public class Yutnori {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines().forEach(line -> {
                StringTokenizer st = new StringTokenizer(line);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                System.out.println(yutResult(a,b,c,d));
            });
        } catch(Exception e) {
            throw e;
        }
    }

    private static String yutResult(int a, int b, int c, int d) {
        int sum = a+b+c+d;

        if (sum == 4)
            return "E";
        if (sum == 3)
            return "A";
        if (sum == 2)
            return "B";
        if (sum == 1)
            return "C";
        if (sum == 0)
            return "D";

        return "E";
    }
}
