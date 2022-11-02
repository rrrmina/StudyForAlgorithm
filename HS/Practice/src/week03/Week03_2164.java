package week03;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

// 카드2
public class Week03_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.remove();
            queue.add(queue.poll());
        }

        bw.write(queue.peek()+"");
        bw.flush();
        bw.close();
    }
}
