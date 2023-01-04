package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar07 {
    private static String SPACE = " ";
    private static String STAR = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfLines = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numOfSpaces = numOfLines - 1;
        int numOfAdded = 0;
        for (int i = 1; i <= numOfLines; i++) {
            bw.write(SPACE.repeat(numOfSpaces--));
            bw.write(STAR.repeat(i));
            bw.write(STAR.repeat(numOfAdded++));
            bw.newLine();
        }

        numOfSpaces += 2;
        numOfAdded -= 2;

        for (int i = numOfLines-1; 0 < i; i--) {
            bw.write(SPACE.repeat(numOfSpaces++));
            bw.write(STAR.repeat(i));
            bw.write(STAR.repeat(numOfAdded--));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
