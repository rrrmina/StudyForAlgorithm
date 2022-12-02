package MA.Practice.week08;

import java.io.*;
import java.util.*;

public class P10026 {
    static int n;
    static char arr[][];
    static boolean visits[][];
    static int dy[] = {-1, 1, 0, 0};
    static int dx[] = {0, 0, -1, 1};

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new char[n][n];
        visits = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[i] = str.toCharArray();
        }

        // 정상
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visits[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'G') arr[i][j] = 'R';
            }
        }
        //색맹
        int rg_cnt = 0;
        visits = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visits[i][j]) {
                    dfs(i, j);
                    rg_cnt++;
                }
            }
        }
        System.out.println(cnt + " " + rg_cnt);
    }

    private static void dfs(int x, int y) {
        visits[x][y] = true;
        char c = arr[x][y];
        for (int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];
            if (xx < 0 || yy < 0 || xx >= n || yy >= n) continue;
            if (!visits[xx][yy] && arr[xx][yy] == c) {
                dfs(xx, yy);
            }
        }
    }
}


