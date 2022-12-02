package week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;

// 전쟁 - 전투
public class Week08_1303 {
    static String[][] map;
    static boolean[][] visited;
    static int[] dx = {0, -1, 0, 1}; // 상좌하우
    static int[] dy = {-1, 0, 1, 0};
    static int w;
    static int h;
    static int count = 0;
    static int whiteRes = 0;
    static int blueRes = 0;

    public static void main(String[] args) throws IOException {
        input();
        solve();
        output();
    }

    private static void output() {
        StringBuilder sb = new StringBuilder();
        sb.append(whiteRes);
        sb.append(" ");
        sb.append(blueRes);
        System.out.println(sb);
    }

    private static void solve() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (!visited[i][j]){
                    dfs(i, j);
                    int square = count * count;
                    if (map[i][j].equals("W")) {
                        whiteRes += square;
                    }
                    if (map[i][j].equals("B")) {
                        blueRes += square;
                    }
                    count = 0;
                }
            }
        }
    }

    private static void dfs(int col, int row) {
        visited[col][row] = true;
        String color = map[col][row];
        count++;
        for (int i = 0; i < 4; i++) {
            int newH = col + dy[i];
            int newW = row + dx[i];
            if (newH >= 0 && newW >= 0 && newH < h && newW < w) {
                if (!visited[newH][newW] && map[newH][newW].equals(color)) {
                    dfs(newH, newW);
                }
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        map = new String[h][w];
        visited = new boolean[h][w];

        for (int i = 0; i < h; i++) {
            String[] temp = br.readLine().split("");
            for (int j = 0; j < temp.length; j++) {
                map[i][j] = temp[j];
            }
        }
    }
}
