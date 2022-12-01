package MA.Practice.week08;

import java.io.*;
import java.util.*;

public class P5567 {
    static int n, m;
    static boolean[][] friends;
    static boolean[] check;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        friends = new boolean[n][n];
        check = new boolean[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            friends[a][b] = true;
            friends[b][a] = true;
        }
        bfs(0);
    }

    private static void bfs(int i) {
        int[] dist = new int[n];
        check[i] = true;
        dist[i] = 0;
        queue.add(i);
        int cnt = 0;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (dist[num] < 2) {
                boolean[] node = friends[num];
                for (int j = 0; j < node.length; j++) {
                    if (friends[num][j] && !check[j]) {
                        queue.add(j);
                        dist[j] = dist[num] + 1;
                        check[j] = true;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
