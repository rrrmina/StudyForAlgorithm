package week05;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 상근이의 여행, 9372
public class Week05_9372 {

    static boolean[] visit; // 방문한 곳을 체크
    static int n, m;
    static int[][] arr;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                n = Integer.parseInt(st.nextToken());
                m = Integer.parseInt(st.nextToken());
            }

            count = 0;
            arr = new int[n + 1][n + 1]; // 노드를 1부터 세기 때문에 크기에 +1을 해야 한다
            visit = new boolean[n + 1];

            for (int j = 0; j < m; j++) { // 비행기 종류만큼 반복
                st = new StringTokenizer(br.readLine());
                int u = 0;
                int v = 0;
                while (st.hasMoreTokens()) {
                    u = Integer.parseInt(st.nextToken());
                    v = Integer.parseInt(st.nextToken());
                }
                // 왕복 표시
                arr[u][v] = 1;
                arr[v][u] = 1;
            }
            bfs();
            bw.write((count-1) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        visit[1] = true; // 시작 노드 방문
        queue.add(1);
        while (!queue.isEmpty()) {
            count++;
            int temp = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (arr[temp][i] != 0 && !visit[i]) {
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
