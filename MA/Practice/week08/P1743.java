package MA.Practice.week08;

import java.io.*;
import java.util.*;

public class P1743 {
    static int n, m, k, answer, temp;
    static boolean[][] path;
    static boolean[][] check;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        path = new boolean[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            path[r - 1][c - 1] = true;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!check[i][j] && path[i][j]) {
                    temp = 0;
                    dfs(i, j);
                    answer = Math.max(answer, temp);
                }
            }
        }
        System.out.println(answer);
    }

    private static void dfs(int x, int y) {
        temp++;
        check[x][y] = true;
        for (int k = 0; k < 4; k++) {
            int xx = x + dx[k];
            int yy = y + dy[k];
            if (xx < 0 || yy < 0 || xx >= n || yy >= m) continue;
            if (!check[xx][yy] && path[xx][yy]) {
                dfs(xx, yy);
            }
        }
    }
}
