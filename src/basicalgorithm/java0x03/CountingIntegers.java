package basicalgorithm.java0x03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingIntegers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numSize = Integer.parseInt(br.readLine());
        StringTokenizer arrSt = new StringTokenizer(br.readLine());
        int targetNum = Integer.parseInt(br.readLine());

        int targetSum = 0;
        while (arrSt.hasMoreTokens()) {
            int tempNum = Integer.parseInt(arrSt.nextToken());
            if (targetNum == tempNum) {
                targetSum++;
            }
        }

        System.out.println(targetSum);
    }
}
