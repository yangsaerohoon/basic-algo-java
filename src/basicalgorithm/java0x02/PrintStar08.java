package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar08 {
    private static String SPACE = " ";
    private static String STAR = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfLines = Integer.parseInt(br.readLine());

        int numOfSpace = numOfLines-1;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=1; i<=numOfLines; i++) {
            bw.write(STAR.repeat(i));
            bw.write(SPACE.repeat(numOfSpace*2));
            bw.write(STAR.repeat(i));
            numOfSpace--;
            bw.newLine();
        }

        numOfSpace += 2;
        for (int i=numOfLines-1; 0<i; i--) {
            bw.write(STAR.repeat(i));
            bw.write(SPACE.repeat(numOfSpace*2));
            bw.write(STAR.repeat(i));
            numOfSpace++;
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}