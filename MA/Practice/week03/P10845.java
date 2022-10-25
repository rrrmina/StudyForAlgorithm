package MA.Practice.week03;
// 큐 https://www.acmicpc.net/problem/10845

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P10845 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int back = -1;

        for(int i = 0 ; i < n ; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str) {
                case "push":
                    back = Integer.parseInt(st.nextToken());
                    queue.offer(back);
                    break;
                case "pop":
                    sb.append(queue.isEmpty()? -1:queue.poll()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()? 1:0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty()? -1:queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty()? -1:back).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
