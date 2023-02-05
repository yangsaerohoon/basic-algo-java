package basicalgorithm.java0x04;

import java.io.*;
import java.util.*;

//(7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>
//1234567   (3-1) * 1 + 0 = 2
//124567 3  (3-1) * 2 + 0 = 4
//12457 36  (3-1) * 3 + 0 = 6 > 5 => 6%5 = 1
//1457 362  (3-1) * 4 + 0 = 8 > 4 => 8-4 = 4
//145 3627
//14 36275
//4 362751
//3627514
public class Josephus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.parseInt(st.nextToken());
        int removeAt = Integer.parseInt(st.nextToken())-1;
        int cur = 0;

        List<Integer> seq = new LinkedList<>();
        for (int i = 0; i < max; i++) {
            seq.add(i + 1);
        }

        ListIterator<Integer> seqIt = seq.listIterator();
        List<Integer> jSeq = new LinkedList<>();
        while (!seq.isEmpty()) {
            if (cur == removeAt) {
                if (seqIt.hasNext()) {
                    jSeq.add(seqIt.next());
                    seqIt.remove();
                    cur = 0;
                } else {
                    rewind(seqIt);
                }
            } else {
                if (seqIt.hasNext()) {
                    seqIt.next();
                    cur++;
                } else {
                    rewind(seqIt);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < jSeq.size(); i++) {
            if (i == 0) {
                bw.write("<");
            }
            bw.write(String.valueOf(jSeq.get(i)));

            if (i == jSeq.size() - 1) {
                bw.write(">");
            } else {
                bw.write(", ");
            }
        }
        bw.flush();
        bw.close();
    }

    private static void rewind(ListIterator<Integer> seqIt) {
        while (seqIt.hasPrevious()) {
            seqIt.previous();
        }
    }
}
