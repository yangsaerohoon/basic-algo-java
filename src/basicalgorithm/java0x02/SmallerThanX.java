package basicalgorithm.java0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SmallerThanX {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        String secondLine = br.readLine();

        StringTokenizer firstToken = new StringTokenizer(firstLine);
        int arraySize = Integer.parseInt(firstToken.nextToken());
        int x = Integer.parseInt(firstToken.nextToken());

        StringTokenizer secondToken = new StringTokenizer(secondLine);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arraySize; i++) {
            int elm = Integer.parseInt(secondToken.nextToken());
            if (elm < x) {
                sb.append(elm).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
