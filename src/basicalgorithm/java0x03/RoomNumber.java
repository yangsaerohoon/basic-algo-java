package basicalgorithm.java0x03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RoomNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] numPlates = br.readLine().toCharArray();

        int[] platesCount = new int[10];
        for (char numPlate : numPlates) {
            platesCount[Integer.parseInt(String.valueOf(numPlate))]++;
        }
        platesCount[9] = (platesCount[9] + platesCount[6] + 1)/2; // 9, 6을 더한 값이 홀수인 경우가 있으므로 1을 더해 올려줌
        platesCount[6] = 0;

        int max = Arrays.stream(platesCount).max().getAsInt();
        System.out.println(max);
    }

//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int roomNumber = Integer.parseInt(br.readLine());
//
//        int[] platesCount = new int[10];
//        int answer = 1;
//        while (roomNumber > 0) {
//            platesCount[roomNumber % 10]++;
//            roomNumber /= 10;
//        }
//
//        for (int i=0; i<platesCount.length; i++) {
//            if (i == 6 || i == 9) {
//                continue;
//            }
//            answer = Math.max(answer, platesCount[i]);
//        }
//        answer = Math.max(answer, (platesCount[6] + platesCount[9])/2);
//
//        System.out.println(answer);
//    }
}
