package MA.Practice.week08;

import java.io.*;
import java.util.*;

public class P1303 {
    static int n;
    static int m;
    static int nx;
    static int ny;
    static int cnt = 0;

    static int white = 0;
    static int black = 0;
    static char battle[][];
    static boolean check[][];

    static int dy[] = {-1, 1, 0, 0};
    static int dx[] = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        battle = new char[m][n];
        check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                char ch = str.charAt(j);
                battle[i][j] = ch;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!check[i][j]) {
                    char color = battle[i][j];
                    cnt = 0;
                    dfs(j, i, color);
                    if (color == 'W') white += cnt * cnt;
                    else black += cnt * cnt;
                }
            }
        }
        System.out.println(white + " " + black);
    }

    static void dfs(int x, int y, char color) {
        check[y][x] = true;
        cnt += 1;
        for (int i = 0; i < 4; i++) {
            ny = y + dy[i];
            nx = x + dx[i];
            if (0 <= ny && ny < m && 0 <= nx && nx < n) {
                if (battle[ny][nx] == color && !check[ny][nx]) {
                    dfs(nx, ny, battle[ny][nx]);
                }
            }
        }
    }
}