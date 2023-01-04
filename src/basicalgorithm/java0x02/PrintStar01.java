package basicalgorithm.java0x02;

import java.io.*;

public class PrintStar01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStar = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= numberOfStar; i++) {
            bw.write(stars(sb, i));
            bw.newLine();
            sb.delete(0, sb.length());
        }

        bw.flush();
        bw.close();
    }

    private static String stars(StringBuffer sb, int count) {
        if (count == 0) {
            return sb.toString();
        }
        sb.append("*");
        return stars(sb, --count);
    }
}
