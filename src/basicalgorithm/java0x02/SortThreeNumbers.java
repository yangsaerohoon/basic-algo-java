package basicalgorithm.java0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int[] numberArray = new int[tokenizer.countTokens()];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(numberArray);

        for (int i : numberArray) {
            System.out.print(i + " ");
        }
    }
}
