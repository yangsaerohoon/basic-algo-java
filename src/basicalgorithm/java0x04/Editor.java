package basicalgorithm.java0x04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Editor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] wordArr = br.readLine().toCharArray();

        List<Character> word = new LinkedList<>();
        for (char c : wordArr) {
            word.add(c);
        }
        int numOfCommands = Integer.parseInt(br.readLine());

        ListIterator<Character> iterator = word.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        for (int i=0; i<numOfCommands; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char command = st.nextToken().charAt(0);
            switch (command) {
                case 'P':
                    iterator.add(st.nextToken().charAt(0));
                    break;
                case 'L':
                    if (iterator.hasPrevious()) iterator.previous();
                    break;
                case 'D':
                    if (iterator.hasNext()) iterator.next();
                    break;
                case 'B':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                default:
                    break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (char c : word) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
