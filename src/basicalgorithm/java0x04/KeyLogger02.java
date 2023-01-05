package basicalgorithm.java0x04;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KeyLogger02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfWords = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numOfWords; i++) {
            List<Character> list = new LinkedList<>();
            int cur = 0;
            char[] pass = br.readLine().toCharArray();

            for (char c : pass) {
                if (c == '<') {
                    if (cur != 0) cur--;
                } else if (c == '>') {
                    if (cur != list.size()) cur++;
                } else if (c == '-') {
                    if (cur != 0) {
                        cur--;
                        list.remove(cur);
                    }
                } else {
                    list.add(cur, c);
                    cur++;
                }
            }

            for (char c : list) {
                bw.write(c);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
