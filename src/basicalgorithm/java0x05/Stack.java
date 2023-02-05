package basicalgorithm.java0x05;

import java.io.*;
import java.util.*;

public class Stack {
    private static List<Integer> stack = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfCommands = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numOfCommands; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    push(x);
                    break;
                case "pop":
                    bw.write(String.valueOf(pop()));
                    bw.newLine();
                    break;
                case "size":
                    bw.write(String.valueOf(size()));
                    bw.newLine();
                    break;
                case "empty":
                    bw.write(String.valueOf(empty()));
                    bw.newLine();
                    break;
                case "top":
                    bw.write(String.valueOf(top()));
                    bw.newLine();
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }

    //push X: 정수 X를 스택에 넣는 연산이다.
    public static void push(int x) {
        stack.add(x);
    }

    //pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
    //만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int pop() {
        int last = -1;
        if (!stack.isEmpty()) {
            last = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
        }

        return last;
    }

    //size: 스택에 들어있는 정수의 개수를 출력한다.
    public static int size() {
        return stack.size();
    }

    //empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    public static int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    //top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int top() {
        return stack.isEmpty() ? -1 : stack.get(stack.size()-1);
    }
}
