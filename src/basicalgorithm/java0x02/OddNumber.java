package basicalgorithm.java0x02;

import java.io.*;

public class OddNumber {
    private static int sumOfOdds = 0;
    private static int minOdd = -1;

    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines().forEach(
                    line -> {
                        checkOddAndSum(Integer.parseInt(line));
                    }
            );
            System.out.println(sumOfOdds == 0? -1:sumOfOdds);
            if (sumOfOdds > 0) {
                System.out.println(minOdd);
            }
        } catch(Exception e) {
            throw e;
        }
    }

    private static void checkOddAndSum(int num) {
        if (num % 2 != 0) {
            sumOfOdds += num;
            if (minOdd < 0 || num < minOdd) {
                minOdd = num;
            }
        }
    }
}
