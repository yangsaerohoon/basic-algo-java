package basicalgorithm.java0x04;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Editor02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        int numOfCommands = Integer.parseInt(br.readLine());

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (char c : word) {
            left.push(c);
        }

        for (int i = 0; i < numOfCommands; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char command = st.nextToken().charAt(0);

            switch (command) {
                case 'L':
                    if (!left.isEmpty()) right.push(left.pop());
                    break;
                case 'D':
                    if (!right.isEmpty()) left.push(right.pop());
                    break;
                case 'B':
                    if (!left.isEmpty()) left.pop();
                    break;
                case 'P':
                    left.push(st.nextToken().charAt(0));
                    break;
                default:
                    break;
            }
        }

        while (!left.isEmpty()) {
            right.push(left.pop());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (!right.isEmpty()) {
            bw.write(right.pop());
        }
        bw.flush();
        bw.close();
    }
}
