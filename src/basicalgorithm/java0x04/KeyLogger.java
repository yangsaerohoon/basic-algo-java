package basicalgorithm.java0x04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class KeyLogger {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfWords = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numOfWords; i++) {
            bw.write(find(br.readLine().toCharArray()));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static String find(char[] word) throws Exception {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (int i=0; i<word.length; i++) {
            if (word[i] == '<') {
                if (!left.isEmpty()) {
                    left.push(word[i]);
                    left.pop();
                }
            } else if (word[i] == '>') {
                if (!right.isEmpty()) {
                    right.push(word[i]);
                    right.pop();
                }
            } else if (word[i] == '-') {
                if (!left.isEmpty()) left.pop();
            } else {
                left.push(word[i]);
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        StringBuffer sb = new StringBuffer();
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }

        return sb.toString();
    }
}
