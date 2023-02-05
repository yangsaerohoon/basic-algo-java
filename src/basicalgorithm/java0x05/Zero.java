package basicalgorithm.java0x05;

import java.io.*;
import java.util.*;

public class Zero {
    private static List<Integer> account = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                zero();
                continue;
            }
            account.add(num);
        }

        System.out.println(account.stream().reduce(0, Integer::sum));
    }

    public static void zero() {
        if (!account.isEmpty()) {
            account.remove(account.size()-1);
        }
    }
}
