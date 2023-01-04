package basicalgorithm.java0x03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfAlphabets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        char[] alphabetArr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] wordArr = word.toCharArray();

        int[] counting = new int[26];
        for (int i = 0; i < alphabetArr.length; i++) {
            char tempAlphabet = alphabetArr[i];
            for (int j = 0; j < wordArr.length; j++) {
                if (wordArr[j] == tempAlphabet) {
                    counting[i]++;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i : counting) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
