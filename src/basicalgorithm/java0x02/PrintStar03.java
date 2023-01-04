package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String star = "*";
        for (int i = numberOfLines; i > 0; i--) {
            bw.write(star.repeat(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
