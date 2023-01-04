package basicalgorithm.java0x02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenDwarfs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dwarfHeight = new int[9];
        int allHeightSum = 0;

        String line;
        int idx = 0;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                break;
            }
            dwarfHeight[idx] = Integer.parseInt(line);
            allHeightSum += dwarfHeight[idx];
            idx++;
        }

        Arrays.sort(dwarfHeight);

        int gap = allHeightSum - 100;
        int[] notDwarfIdx = new int[2];

        for (int i=0; i<dwarfHeight.length; i++) {
            for (int j = i + 1; j < dwarfHeight.length; j++) {
                if (dwarfHeight[i] + dwarfHeight[j] == gap) {
                    notDwarfIdx[0] = i;
                    notDwarfIdx[1] = j;
                }
            }
        }

        for (int i = 0; i < dwarfHeight.length; i++) {
            if (i != notDwarfIdx[0] && i != notDwarfIdx[1]) {
                System.out.println(dwarfHeight[i]);
            }
        }
    }
}
