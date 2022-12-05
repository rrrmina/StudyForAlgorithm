package MA.Practice.week09;

import java.io.*;
import java.util.*;

public class P1890 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] game = new int[n][n];
        long[][] dp = new long[n][n];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                game[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (game[x][y] == 0) break;
                else {
                    if ((x + game[x][y]) < n) dp[x + game[x][y]][y] += dp[x][y];
                    if ((y + game[x][y]) < n) dp[x][y + game[x][y]] += dp[x][y];
                }
            }
        }
        System.out.println(dp[n - 1][n - 1]);
    }
}
