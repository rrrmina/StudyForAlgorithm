package week03;

import java.io.*;

// 1,2,3 더하기
public class Week03_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            int[] dp = new int[11];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for (int j = 4; j <= m; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }
            bw.write(dp[m] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
