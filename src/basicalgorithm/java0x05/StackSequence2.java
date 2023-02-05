package basicalgorithm.java0x05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int cnt = 1;
        StringBuffer ans = new StringBuffer();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                break;
            }
            int t = Integer.parseInt(line);
            while (cnt <= t) {
                stack.push(cnt++);
                ans.append("+").append("\n");
            }
            if (stack.peek() != t) {
                System.out.println("NO\n");
                return;
            }
            stack.pop();
            ans.append("-").append("\n");
        }

        System.out.println(ans);
    }
}
