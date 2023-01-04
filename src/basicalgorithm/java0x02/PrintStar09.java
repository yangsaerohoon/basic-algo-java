package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar09 {
    private static String SPACE = " ";
    private static String STAR = "*";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfLines = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=numOfLines; 0 < i; i--) {
            bw.write(SPACE.repeat(numOfLines - i));
            bw.write(STAR.repeat((i*2) - 1));
            bw.write(SPACE.repeat(numOfLines - i));
            bw.newLine();
        }

        for (int i=2; i<=numOfLines; i++) {
            bw.write(SPACE.repeat(numOfLines - i));
            bw.write(STAR.repeat((i*2) - 1));
            bw.write(SPACE.repeat(numOfLines - i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
