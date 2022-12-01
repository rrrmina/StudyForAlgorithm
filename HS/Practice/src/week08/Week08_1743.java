package week08;

import java.io.*;
import java.util.StringTokenizer;

// 음식물 피하기
public class Week08_1743 {
    static int w;
    static int h;
    static int[][] map;
    static boolean[][] visited;
    static int count = 0;
    static int max = 0;
    static int[] dx = {0, -1, 0, 1}; // 상좌하우
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    private static void output() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(max);
        System.out.println(sb);
    }

    private static void solve() {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(i, j);
                    max = Math.max(max, count);
                    count = 0;
                }
            }
        }
    }

    private static void dfs(int col, int row ) {
        visited[col][row] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int newH = col + dy[i];
            int newW = row + dx[i];
            if (newH > 0 && newW > 0 && newH <= h && newW <= w) {
                if (map[newH][newW] == 1 && !visited[newH][newW]) {
                    dfs(newH, newW);
                }
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        map = new int[h + 1][w + 1];
        visited = new boolean[h + 1][w + 1];

        for (int i = 0; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
        }
    }
}
