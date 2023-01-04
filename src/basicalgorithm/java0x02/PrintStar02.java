package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStars = Integer.parseInt(br.readLine());

        String space = " ";
        String star = "*";
        StringBuffer sb = new StringBuffer();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= numberOfStars; i++) {
            sb.append(space.repeat(numberOfStars - i));
            sb.append(star.repeat(i));
            bw.write(sb.toString());
            bw.newLine();
            sb.delete(0, sb.length());
        }
        bw.flush();
        bw.close();
    }
}
