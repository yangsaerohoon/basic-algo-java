package basicalgorithm.java0x03;

import java.io.*;

public class NumberOfDigits {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        char[] digitSource = "0123456789".toCharArray();
        char[] digitArr = String.valueOf(a * b * c).toCharArray();
        int[] result = new int[10];
        for (int i=0; i<digitSource.length; i++) {
            for (char digit : digitArr) {
                if (digitSource[i] == digit) {
                    result[i]++;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : result) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
