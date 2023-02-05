package basicalgorithm.java0x05;

//43687521

//123
//4

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

//12345678
//43687521
//1234 ++++
//123 -
//12 -
//1256 ++
//125 -
//12578 ++
//1257 -
//125 -
//12 -
//1 -
// -

//1 * 4 = 4
//4 - 3 = 1
//++

//pop 도중 stack이 비는 경우
public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stackSize = Integer.parseInt(br.readLine());

        //87654321
        Stack<Integer> integerStack = new Stack<>();
        for (int i = stackSize; i>0; i--) {
            integerStack.push(i);
        }

        //43687521
        List<Integer> seq = new ArrayList<>();
        for (int i = 0; i < stackSize; i++) {
            seq.add(Integer.parseInt(br.readLine()));

        }

        Stack<Integer> temp = new Stack<>();
        temp.push(0);
        List<String> tempSeq = new ArrayList<>();
        for (int num : seq) { // 43687521
            while (!integerStack.isEmpty() && !temp.isEmpty()) { //integerStack = 87654321
                int top = temp.peek(); //
                if (top == num) { //
                    //pop
                    temp.pop(); //temp =
                    tempSeq.add("-");
                    break;
                }
                //push
                temp.push(integerStack.pop());//integerStack = , temp =
                tempSeq.add("+");
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String s : tempSeq) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
