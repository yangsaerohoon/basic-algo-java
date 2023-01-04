package basicalgorithm.java0x02;

import java.io.*;

public class GreatestNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int greatestIdx = 0;
        int greatest = 0;

        for (int i=1; i<=9; i++) {
            int tempNum = Integer.parseInt(br.readLine());
            if (greatest < tempNum) {
                greatest = tempNum;
                greatestIdx = i;
            }
        }

        System.out.println(greatest);
        System.out.println(greatestIdx);
    }
}
