package week08;

import java.io.*;
import java.util.StringTokenizer;

public class Week08_4963 {
    static int[][] map;
    static boolean[][] visited;
    static int count;
    static int w;
    static int h;
    static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0}; // 12시부터 반시계 방향
    static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

    public static void main(String[] args) throws IOException {
        while (true) {
            input();
            if (w == 0 && h == 0) {
                break;
            }
            solve();
            output();
        }
    }

    private static void output() throws IOException {
        System.out.println(count);
    }

    private static void solve() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(i, j);
                    count++;
                }
            }
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newY >= 0 && newX >= 0 && newY < w && newX < h) {
                if (map[newX][newY] == 1 && !visited[newX][newY]) {
                    dfs(newX, newY);
                }
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        map = new int[h][w];
        visited = new boolean[h][w];
        count = 0;
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            int j = 0;
            while (st.hasMoreTokens()) {
                map[i][j++] = Integer.parseInt(st.nextToken());
            }
        }
    }
}