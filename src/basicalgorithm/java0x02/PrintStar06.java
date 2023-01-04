package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar06 {
    private static String STAR = "*";
    private static String SPACE = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfSpace = 0;
        int numberOfAddedStar = numberOfLines - 1;
        for (int i = numberOfLines; 0 < i; i--) {
            bw.write(SPACE.repeat(numberOfSpace++));
            bw.write(STAR.repeat(i));
            bw.write(STAR.repeat(numberOfAddedStar--));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
