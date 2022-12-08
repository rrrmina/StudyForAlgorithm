package week09;

import java.io.*;

// 점프
public class Week09_1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        long[][] dp = new long[n][n];

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }
        dp[0][0] = 1; // 방문한 위치에 +1을 하면 마지막 위치에서 전체 경로 수 찾을 수 있다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 && j == n - 1) {
                    continue;
                }
                int value = map[i][j];
                if (i + value < n) {
                    dp[i + value][j] += dp[i][j];
                }
                if (j + value < n) {
                    dp[i][j + value] += dp[i][j];
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}
