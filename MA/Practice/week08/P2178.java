package MA.Practice.week08;

import java.io.*;
import java.util.*;

public class P2178 {
    static int n, m;
    static char[][] arr;
    static boolean[][] check;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[i] = str.toCharArray();
        }
        bfs(0, 0);
    }

    private static void bfs(int x, int y) {
        int[][] dist = new int[n][m];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        check[x][y] = true;
        dist[x][y] = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int k = 0; k < 4; k++) {
                int xx = node.x + dx[k];
                int yy = node.y + dy[k];
                if (xx < 0 || yy < 0 || xx >= n || yy >= m) continue;
                if (!check[xx][yy] && arr[xx][yy] == '1') {
                    queue.add(new Node(xx, yy));
                    check[xx][yy] = true;
                    dist[xx][yy] = dist[node.x][node.y] + 1;
                }
            }
        }
        System.out.println(dist[n - 1][m - 1] + 1);
    }
}