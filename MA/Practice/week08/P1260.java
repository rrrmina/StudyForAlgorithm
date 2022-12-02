package MA.Practice.week08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1260 {
    static int n, m;
    static boolean[][] arr;
    static boolean[] check;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken()) - 1;
        arr = new boolean[n][n];
        check = new boolean[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            arr[a][b] = true;
            arr[b][a] = true;
        }
        sb = new StringBuilder();
        dfs(v);
        check = new boolean[n];
        sb.append('\n');
        bfs(v);
    }

    private static void dfs(int v) {
        check[v] = true;
        sb.append(v + 1).append(" ");
        for (int i = 0; i < n; i++) {
            if (arr[v][i] && !check[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        check[v] = true;
        queue.add(v);
        sb.append(v + 1).append(" ");
        while (!queue.isEmpty()) {
            int num = queue.poll();
            for (int i = 0; i < n; i++) {
                if (arr[num][i] && !check[i]) {
                    queue.add(i);
                    sb.append(i + 1).append(" ");
                    check[i] = true;
                }
            }
        }
        System.out.println(sb);
    }
}
