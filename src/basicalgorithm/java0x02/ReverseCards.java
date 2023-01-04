package basicalgorithm.java0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ReverseCards {
    private static int[] cards = new int[20];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 20; i++) {
            cards[i - 1] = i;
        }

        String line;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            reverse(start, end);
        }

        String collect = Arrays.stream(cards)
                .mapToObj(String::valueOf).collect(Collectors.joining(" "));

        System.out.println(collect);
    }

    private static void reverse(int startIdx, int endIdx) {
        startIdx--;
        endIdx--;

        int tempSize = (endIdx - startIdx) + 1;
        int tempStart = startIdx;
        int[] temp = new int[tempSize];
        for (int i = 0; i < tempSize; i++) {
            temp[i] = cards[tempStart++];
        }

        int newIdx = temp.length - 1;
        for (int i = startIdx; i <= endIdx; i++) {
            cards[i] = temp[newIdx--];
        }
    }
}
