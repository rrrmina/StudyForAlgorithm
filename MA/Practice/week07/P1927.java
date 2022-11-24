package MA.Practice.week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > 0) {
                minQueue.add(x);
            } else {
                if (!minQueue.isEmpty()) sb.append(minQueue.poll());
                else sb.append(0);
                sb.append('\n');
            }
        }
        System.out.println(sb);
    }
}

