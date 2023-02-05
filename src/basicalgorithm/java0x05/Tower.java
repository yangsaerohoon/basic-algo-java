package basicalgorithm.java0x05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

public class Tower {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] towers = new int[n];
//        for (int i=0; i<towers.length; i++) {
//            towers[i] = Integer.parseInt(st.nextToken());
//        }
//
//        StringBuffer result = new StringBuffer();
//        result.append("0").append(" ");
//        for (int i=1; i<towers.length; i++) {
//            int idx = 0;
//            int t = towers[i];
//            for (int j=i-1; j>0; j--) {
//                if (towers[j] >= t) {
//                    idx = j+1;
//                    break;
//                }
//            }
//            result.append(idx).append(" ");
//        }
//
//        System.out.println(result.toString().trim());
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            Map.Entry<Integer, Integer> tower =
                    new AbstractMap.SimpleEntry<>(Integer.parseInt(st.nextToken()), i + 1);

            while (!stack.isEmpty()) {
                if (tower.getKey() > stack.peek().getKey()) {
                    stack.pop();
                } else {
                    sb.append(stack.peek().getValue()).append(" ");
                    break;
                }
            }
            if (stack.empty()) {
                sb.append(0).append(" ");
            }
            stack.push(tower);
        }

        System.out.println(sb.toString().trim());
    }
}
