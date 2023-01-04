package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar05 {
    private static String SPACE = " ";
    private static String STAR = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfSpaces = (numberOfLines-1);
        int numberOfAddedStar = 0;
        for (int i=1; i<=numberOfLines; i++) {
            bw.write(SPACE.repeat(numberOfSpaces--));
            bw.write(STAR.repeat(i));
            bw.write(STAR.repeat(numberOfAddedStar++));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
