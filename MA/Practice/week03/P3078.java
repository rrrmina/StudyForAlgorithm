package MA.Practice.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 좋은 친구 https://www.acmicpc.net/problem/3078
public class P3078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long answer = 0;

        Queue<Integer>[] students = new Queue[21];

        for (int i = 0; i <= 20; i++) {
            students[i] = new LinkedList<>();
        }

        for (int i=0; i<n; i++) {
            int name = br.readLine().length();
            if (students[name].isEmpty()) {
                students[name].offer(i);
                continue;
            }
            while (i - students[name].peek() > k) {
                students[name].poll();
                if (students[name].isEmpty()) {
                    break;
                }
            }
            answer += students[name].size();
            students[name].offer(i);
        }
        System.out.println(answer);
    }
}