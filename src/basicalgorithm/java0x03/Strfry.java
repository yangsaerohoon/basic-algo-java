package basicalgorithm.java0x03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Strfry {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfLines = Integer.parseInt(br.readLine());

        for (int i=0; i<numOfLines; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] words = st.nextToken().toCharArray();
            char[] strfrieds = st.nextToken().toCharArray();

            if (words.length != strfrieds.length) {
                System.out.println("Impossible");
                continue;
            }

            Arrays.sort(words);
            Arrays.sort(strfrieds);
            if (isSameArray(words, strfrieds)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }

    private static boolean isSameArray(char[] arr1, char[] arr2) {
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
