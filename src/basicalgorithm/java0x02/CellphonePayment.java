package basicalgorithm.java0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CellphonePayment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int callCount = Integer.parseInt(br.readLine());

        StringTokenizer callMinutes = new StringTokenizer(br.readLine());
        int[] callMinArr = new int[callCount];
        for (int i = 0; i < callCount; i++) {
            callMinArr[i] = Integer.parseInt(callMinutes.nextToken());
        }

        int ysSum = 0;
        int msSum = 0;
        for (int min : callMinArr) {
            ysSum += ysPricing(min);
            msSum += msPricing(min);
        }

        if (ysSum < msSum) {
            System.out.println("Y " + ysSum);
        } else if (msSum < ysSum) {
            System.out.println("M " + msSum);
        } else {
            System.out.println("Y M " + msSum);
        }
    }

    private static int ysPricing(int minute) {
        return ((minute / 30) + 1) * 10;
    }

    private static int msPricing(int minute) {
        return ((minute / 60) + 1) * 15;
    }
}
