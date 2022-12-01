package week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// DFS와 BFS
public class Week08_1260 {
    static int[][] map;
    static boolean[] visited;
    static int start, n, m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input();
        dfs(start);
        sb.append("\n");
        bfs();
        System.out.println(sb);
    }

    private static void dfs(int index) {
        visited[index] = true;
        sb.append(index + " ");
        for (int i = 0; i <= n; i++) {
            if (!visited[i] && map[index][i] == 1) {
                dfs(i);
            }
        }
    }

    private static void bfs() {
        visited = new boolean[n + 1];
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            sb.append(temp + " ");
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && map[temp][i] == 1) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }
    }
}
