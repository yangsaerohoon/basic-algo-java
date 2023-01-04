package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar04 {
    private static String SPACE = " ";
    private static String STAR = "*";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = numberOfLines; 0 < i; i--) {
            bw.write(SPACE.repeat(numberOfLines - i));
            bw.write(STAR.repeat(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
