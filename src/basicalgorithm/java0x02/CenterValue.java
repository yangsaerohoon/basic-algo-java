package basicalgorithm.java0x02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CenterValue {
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] arr = new int[5];
            int idx = 0;
            int sum = 0;
            String line;
            while((line=br.readLine()) != null) {
                arr[idx] = Integer.parseInt(line);
                sum += arr[idx];
                idx++;
            }
            System.out.println(sum/5);
            Arrays.sort(arr);
            System.out.println(arr[arr.length/2]);
        } catch(Exception e) {
            throw e;
        }
    }
}
