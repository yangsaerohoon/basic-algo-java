package basicalgorithm.java0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrintIntegersBetweenAB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (a < b) {
            printAllIntegers(a, b);
        } else if (a > b) {
            printAllIntegers(b, a);
        } else {
            System.out.println(0);
        }
    }

    private static void printAllIntegers(long a, long b) {
        System.out.println((b-a)-1);

        StringBuffer sb = new StringBuffer();
        for (long i = a + 1; i < b; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
