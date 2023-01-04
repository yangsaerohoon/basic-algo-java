package basicalgorithm.java0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckLeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        System.out.println(isLeapYear(year));
    }

    private static int isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) {
            return 1;
        }
        return 0;
    }
}
