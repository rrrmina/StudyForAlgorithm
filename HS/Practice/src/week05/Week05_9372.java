package week05;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

// 상근이의 여행, 9372
public class Week05_9372 {
    static boolean[] visit;
    static int result; // 방문한 곳을 체크
    static int n, m;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] nm = br.readLine().split(" ");
            n = Integer.parseInt(nm[0]);
            m = Integer.parseInt(nm[1]);

            result = 0;

            arr = new int[n + 1][n + 1];
            visit = new boolean[n + 1];
            for (int j = 0; j < m; j++) {
                String[] ab = br.readLine().split(" ");
                int a = Integer.parseInt(ab[0]);
                int b = Integer.parseInt(ab[1]);
                arr[a][b] = 1;
                arr[b][a] = 1;
            }
            bfs();
            bw.write(result - 1 + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;
        while (!queue.isEmpty()) {
            result++;
            int val = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (arr[val][i] != 0 && !visit[i]) {
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
