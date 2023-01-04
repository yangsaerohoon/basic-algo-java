package basicalgorithm.java0x03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfTwoNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrSize = Integer.parseInt(br.readLine());
        boolean[] numberEx = new boolean[2000001];

        int[] arr = new int[arrSize];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<arrSize; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < arrSize; i++) {
            if (x - arr[i] > 0 && numberEx[x - arr[i]]) {
                answer++;
            }
            numberEx[arr[i]] = true;
        }

        System.out.println(answer);
    }
}
