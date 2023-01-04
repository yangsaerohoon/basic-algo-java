package basicalgorithm.java0x03;

import java.io.*;
import java.util.*;

public class ArrangingRoom {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxCountPerRoom = Integer.parseInt(st.nextToken());

        int[][] roomArr = new int[6][2];
        String line;
        while((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                break;
            }
            StringTokenizer tempSt = new StringTokenizer(line);
            int gender = Integer.parseInt(tempSt.nextToken());
            int grade = Integer.parseInt(tempSt.nextToken())-1;
            roomArr[grade][gender]++;
        }

        int numOfRooms = 0;
        for (int i=0; i<roomArr.length; i++) {
            if (roomArr[i][0] > 0 || roomArr[i][1] > 0) {
                int tempGirlsRoomCount = (roomArr[i][0] / maxCountPerRoom) + ((roomArr[i][0] % maxCountPerRoom) != 0 ? 1 : 0);
                int tempBoysRoomCount = (roomArr[i][1] / maxCountPerRoom) + ((roomArr[i][1] % maxCountPerRoom) != 0 ? 1 : 0);
                numOfRooms += tempGirlsRoomCount + tempBoysRoomCount;
            }
        }

        System.out.println(numOfRooms);
    }
}
