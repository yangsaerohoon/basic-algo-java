package basicalgorithm.java0x03;

import java.io.*;
import java.util.*;

public class Anagram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] first = br.readLine().toCharArray();
        char[] second = br.readLine().toCharArray();

        for (int i=0; i<first.length; i++) {
            int sameCount = 0;
            for (int j=0; j<second.length; j++) {
                if (first[i] == second[j]) {
                    second[j] = '-';
                    sameCount++;
                    break;
                }
            }
            if (sameCount > 0) {
                first[i] = '-';
            }
        }

        int sum = 0;
        for (char c : first) {
            if (c != '-') sum++;
        }
        for (char c : second) {
            if (c != '-') sum++;
        }

        System.out.println(sum);
    }
}
